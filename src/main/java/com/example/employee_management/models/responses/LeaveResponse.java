package com.example.employee_management.models.responses;

import com.example.employee_management.models.entities.LeaveType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
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
