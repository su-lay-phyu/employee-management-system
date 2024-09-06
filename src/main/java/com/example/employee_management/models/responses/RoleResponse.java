package com.example.employee_management.models.responses;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class RoleResponse{
    private Long id;
    private String name;
}
