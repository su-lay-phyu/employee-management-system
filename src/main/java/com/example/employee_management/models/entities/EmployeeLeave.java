package com.example.employee_management.models.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "employee_leaves")
public class EmployeeLeave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @Column(name = "employee_id")
    private Employee employee;
    @ManyToOne(fetch = FetchType.EAGER)
    @Column(name="leave_id")
    private Leave leave;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;

    private String reason;
}
