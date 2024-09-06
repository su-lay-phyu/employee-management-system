package com.example.employee_management.models.requests;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@RequiredArgsConstructor
public class SalaryRequest {
    private String amount;
    private Date fromDate;
    private Date toDate;
}
