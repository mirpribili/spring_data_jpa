package com.example.spring.springboot.spring_data_jpa.dao;

import com.example.spring.springboot.spring_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//import java.util.List;

public interface EmployeeRepository extends
        JpaRepository<Employee, Integer
                /*== primary key (Employee --> private int id;) */
                > { // old EmployeeDAO
//    public List<Employee> getAllEmployees();
//
//    public void saveEmployee(Employee employee);
//
//    public Employee getEmployee(int id);
//
//    void deleteEmployee(int id);


    // тут важно создавать метод согласно определенным правилам!
    public List<Employee> findAllByName(String name); // автодополнение в про IDE
}
