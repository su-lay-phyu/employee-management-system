package com.example.employee_management.models.requests;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class DepartmentRequest {
    private Long id;
    private String name;
    private String mobile;
    private String address;
}
