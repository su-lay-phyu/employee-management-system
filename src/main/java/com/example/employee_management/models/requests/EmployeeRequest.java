package com.example.employee_management.models.requests;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@RequiredArgsConstructor
public class EmployeeRequest {
    private String name;
    private String nrcNo;
    private String email;
    private String mobile;
    private String gender;
    private Date dob;
    private String address;
    private Date joiningDate;
}
