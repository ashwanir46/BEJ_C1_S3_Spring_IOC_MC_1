package org.example;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean("Employee1")
    public Employee getEmployee() {
        Employee employee = new Employee(getDep());
        employee.setEmployeeId(1010);
        employee.setEmployeeName("Narendra");
        return employee;
    }

    @Bean
    public Department getDep() {
        Department department = new Department();
        department.setDepId(201);
        department.setDepName("Mathematics");
        return department;
    }
}
