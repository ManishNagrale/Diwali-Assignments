package com.demo.test;

import java.util.List;
import java.util.Scanner;
import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class EmployeeTest {

    public static void main(String[] args) {
        EmployeeService service = new EmployeeServiceImpl();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Show All Employees");
            System.out.println("4. Show Sorted Employees");
            System.out.println("5. Find Employee by Name");
            System.out.println("6. Save Employees to File");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Employee Role: ");
                String role = sc.nextLine();

                Employee emp = new Employee(id, name, role);
                boolean added = service.addEmployee(emp);

                if (added) {
                    System.out.println("Employee added successfully!");
                } else {
                    System.out.println("Failed to add employee.");
                }

            } else if (choice == 2) {
                System.out.print("Enter Employee ID to remove: ");
                int id = sc.nextInt();
                boolean removed = service.removeEmployee(id);

                if (removed) {
                    System.out.println("Employee removed successfully!");
                } else {
                    System.out.println("Employee not found.");
                }

            } else if (choice == 3) {
                List<Employee> list = service.getAllEmployees();
                if (list.isEmpty()) {
                    System.out.println("No employees found.");
                } else {
                    System.out.println("\nAll Employees:");
                    for (Employee e : list) {
                        System.out.println(e);
                    }
                }

            } else if (choice == 4) {
                List<Employee> sorted = service.getSortedEmployees();
                System.out.println("\nEmployees sorted by ID:");
                for (Employee e : sorted) {
                    System.out.println(e);
                }

            } else if (choice == 5) {
                System.out.print("Enter Employee Name to search: ");
                String name = sc.nextLine();
                Employee emp = service.findEmployee(name);

                if (emp != null) {
                    System.out.println("Employee Found: " + emp);
                } else {
                    System.out.println("Employee not found.");
                }

            } else if (choice == 6) {
                boolean saved = service.saveToFile();
                if (saved) {
                    System.out.println("Employees saved to file successfully!");
                } else {
                    System.out.println("Error saving employees to file.");
                }

            } else if (choice == 7) {
                System.out.println("Thank you for Visiting | program terminated");
            } else {
                System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
