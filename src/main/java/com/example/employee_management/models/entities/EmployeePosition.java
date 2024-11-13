package com.example.employee_management.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Table(name="employee_positions")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class EmployeePosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @Column(name = "employee_id")
    private Employee employee;
    @ManyToOne(fetch = FetchType.EAGER)
    @Column(name = "position_id")
    private Position position;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;
}
