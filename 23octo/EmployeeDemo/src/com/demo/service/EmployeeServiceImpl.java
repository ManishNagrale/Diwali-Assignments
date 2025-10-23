package com.demo.service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao dao;

    public EmployeeServiceImpl() {
        dao = new EmployeeDaoImpl(); 
    }

    @Override
    public boolean addEmployee(Employee emp) {
        return dao.addEmployee(emp);
    }

    @Override
    public boolean removeEmployee(int empID) {
        return dao.removeEmployee(empID);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return dao.getAllEmployees();
    }

    @Override
    public List<Employee> getSortedEmployees() {
        List<Employee> list = dao.getAllEmployees();
        Collections.sort(list, Comparator.comparingInt(Employee::getEmpID));
        return list;
    }

    @Override
    public Employee findEmployee(String name) {
        return dao.findByName(name);
    }

    @Override
    public boolean saveToFile() {
        List<Employee> list = dao.getAllEmployees();
        try (FileWriter writer = new FileWriter("src/employees.txt")) {
            for (Employee e : list) {
                writer.write(e.toString() + "\n");
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
