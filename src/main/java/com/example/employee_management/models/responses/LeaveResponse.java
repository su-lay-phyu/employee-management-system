package com.example.employee_management.models.responses;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@RequiredArgsConstructor
public class LeaveResponse {
    private Long id;
    private String reason;
    private String description;
    private LeaveType type;
    private Date fromDate;
    private Date toDate;
}
