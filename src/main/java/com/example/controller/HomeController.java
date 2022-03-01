package com.example.controller;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getEmployees")
    public String getAllEmployees() {
        return "Welcome to Spring";
    }

        public ResponseEntity<Employee> createTutorial(@RequestBody Employee employee) {

            try {
                Employee emp1 = employeeService.createEmployee(employee);

                return new ResponseEntity<>(emp1, HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }





        }
