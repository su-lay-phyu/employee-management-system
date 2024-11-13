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
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;
    @Column(name = "employee_status")
    @Enumerated(EnumType.STRING)
    private EmployeeStatus employeeStatus;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="department_id")
    private Department department;
}
