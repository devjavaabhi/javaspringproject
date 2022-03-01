package com.example.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="EmployeeTbl")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="Employee_Id")
    private Integer employeeId;
    @Column(name = "Employee_Name")
    private String employeeName;
    @Column(name = "Age")
    private Integer age;
    @Column(name = "Address")
    private String address;

}
