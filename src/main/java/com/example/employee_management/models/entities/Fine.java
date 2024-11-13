package com.example.employee_management.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "fines")
public class Fine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int amount;
}
