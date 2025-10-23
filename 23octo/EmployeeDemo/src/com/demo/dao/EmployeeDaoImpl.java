package com.demo.dao;

import java.util.ArrayList;
import java.util.List;
import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
    private static List<Employee> empList = new ArrayList<>();

    static {
        empList.add(new Employee(101, "Manish", "Manager"));
        empList.add(new Employee(102, "Bhushan", "Developer"));
        empList.add(new Employee(103, "Jayant", "Tester"));
    }

    @Override
    public boolean addEmployee(Employee emp) {
        return empList.add(emp);
    }

    @Override
    public boolean removeEmployee(int empID) {
        return empList.removeIf(e -> e.getEmpID() == empID);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return empList;
    }

    @Override
    public Employee findByName(String name) {
        for (Employee e : empList) {
            if (e.getEmpName().equalsIgnoreCase(name)) {
                return e;
            }
        }
        return null;
    }
}
