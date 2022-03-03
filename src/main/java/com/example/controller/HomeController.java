package com.example.controller;

import com.example.exception.RecordNotFoundException;
import com.example.model.Employee;https://github.com/devjavaabhi/javaspringproject/blob/master/src/main/java/com/example/controller/HomeController.java
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
public class HomeController {


    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getEmployees")
    public ResponseEntity<List<Employee>> getAllEmployees() throws Exception {

        List<Employee> listOfEmployee=new ArrayList<>();

        listOfEmployee=employeeService.getAllEmployees();

        if(true){
        //    throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Foo Not Found");
      throw new RecordNotFoundException("Record not Found :Changes for merge");
        }

      return new ResponseEntity<List<Employee>>(listOfEmployee, HttpStatus.OK);
    }

    @PostMapping("/createEmployee")
    public ResponseEntity<Employee> createTutorial(@RequestBody Employee employee) {

            try {
                Employee emp1 = employeeService.createEmployee(employee);

                return new ResponseEntity<>(emp1, HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }





        }
