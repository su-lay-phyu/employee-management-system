package com.example.employee_management.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "employees")
@Getter
@Setter
@RequiredArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "nrc_no")
    private String nrcNo;
    private String email;
    private String password;
    private String mobile;
    private String gender;
    private Date dob;
    private String address;
    @Column(name = "joining_date")
    private Date joiningDate;
}
