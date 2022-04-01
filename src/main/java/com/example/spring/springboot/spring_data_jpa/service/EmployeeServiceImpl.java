package com.example.spring.springboot.spring_data_jpa.service;

import com.example.spring.springboot.spring_data_jpa.dao.EmployeeRepository;
import com.example.spring.springboot.spring_data_jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
//    private EmployeeDAO employeeDAO; // прописали зависимость
    private EmployeeRepository employeeRepository;

    @Override
//    @Transactional
    public List<Employee> getAllEmployees() {

//        return employeeDAO.getAllEmployees();
        return employeeRepository.findAll();
    }

    @Override
//    @Transactional
    public void saveEmployee(Employee employee) {
        
//        employeeDAO.saveEmployee(employee);
        employeeRepository.save(employee);
    }

    @Override
//    @Transactional
    public Employee getEmployee(int id) {
//        return employeeDAO.getEmployee(id);
        Employee employee = null;
        Optional<Employee> optional = employeeRepository.findById(id);
        if(optional.isPresent()){
                employee = optional.get();
        }
        return employee;
    }

    @Override
//    @Transactional
    public void deleteEmployee(int id) {
//        employeeDAO.deleteEmployee(id);
        employeeRepository.deleteById(id);
    }
}
