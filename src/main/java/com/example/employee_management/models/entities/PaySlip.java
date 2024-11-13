package com.example.employee_management.models.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "pay_slips")
public class PaySlip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int amount;
    private Date payDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @Column(name="employee_id")
    private Employee employee;

}
