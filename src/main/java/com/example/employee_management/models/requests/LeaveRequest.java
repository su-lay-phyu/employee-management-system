package com.example.employee_management.models.requests;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@RequiredArgsConstructor
public class LeaveRequest {
    private String reason;
    private String description;
    private LeaveType type;
    private Date fromDate;
    private Date toDate;
}
