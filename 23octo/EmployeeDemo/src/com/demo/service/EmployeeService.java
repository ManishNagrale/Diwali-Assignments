package com.demo.service;

import java.util.List;
import com.demo.beans.Employee;

public interface EmployeeService {
    boolean addEmployee(Employee emp);
    boolean removeEmployee(int empID);
    List<Employee> getAllEmployees();
    List<Employee> getSortedEmployees();
    Employee findEmployee(String name);
    boolean saveToFile();
}

