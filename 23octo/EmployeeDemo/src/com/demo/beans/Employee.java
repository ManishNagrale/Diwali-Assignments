package com.demo.beans;

public class Employee {
    private String empName;
    private int empID;
    private String empRole;

    public Employee() {
        this.empName = null;
        this.empRole = "Designer";
        this.empID = 0;
    }

    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = "Developer";
    }

    public Employee(int empID, String empName, String empRole) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = empRole;
    }

    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }

    public int getEmpID() { return empID; }
    public void setEmpID(int empID) { this.empID = empID; }

    public String getEmpRole() { return empRole; }
    public void setEmpRole(String empRole) { this.empRole = empRole; }

    @Override
    public String toString() {
        return "Employee [ID=" + empID + ", Name=" + empName + ", Role=" + empRole + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("In hashCode method " + empID);
        return empID;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Employee)) return false;
        System.out.println("In equals method " + this.empID + " ---- " + ((Employee) obj).empID);
        return this.empID == ((Employee) obj).empID;
    }
}
