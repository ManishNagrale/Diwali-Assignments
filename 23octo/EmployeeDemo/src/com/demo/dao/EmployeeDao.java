package com.demo.dao;

import java.util.List;
import com.demo.beans.Employee;

public interface EmployeeDao {
    boolean addEmployee(Employee emp);
    boolean removeEmployee(int empID);
    List<Employee> getAllEmployees();
    Employee findByName(String name);
}
