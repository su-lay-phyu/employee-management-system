package com.example.employee_management.models.responses;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@RequiredArgsConstructor
public class SalaryResponse{
    private Long id;
    private String amount;
    private Date fromDate;
    private Date toDate;
}
