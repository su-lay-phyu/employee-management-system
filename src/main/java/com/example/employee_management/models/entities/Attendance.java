package com.example.employee_management.models.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "attendances")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="arrival_time")
    private Instant arrivalTime;
    @ManyToOne(fetch = FetchType.EAGER)
    @Column(name="employee_id")
    private Employee employee;
}
