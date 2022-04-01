package com.example.spring.springboot.spring_data_jpa.service;

import com.example.spring.springboot.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}