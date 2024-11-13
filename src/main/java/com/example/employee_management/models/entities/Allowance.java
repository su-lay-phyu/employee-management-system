package com.example.employee_management.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name="allowances")
public class Allowance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int amount;
}
