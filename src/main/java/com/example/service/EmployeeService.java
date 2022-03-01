package com.example.service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee emp)
    {
        employeeRepository.save(emp);
        return emp;
    }

    public List<Employee> getAllEmployees()
    {
      return employeeRepository.findAll();

    }
}
