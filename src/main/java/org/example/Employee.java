package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private int employeeId;
    private String employeeName;
    private Department employeeDep;

    @Autowired
    public Employee(Department employeeDep) {
        this.employeeDep = employeeDep;
    }

    public Employee(int employeeId, String employeeName, Department employeeDep) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDep = employeeDep;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Department getEmployeeDep() {
        return employeeDep;
    }

    public void setEmployeeDep(Department employeeDep) {
        this.employeeDep = employeeDep;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDep=" + employeeDep +
                '}';
    }
}
