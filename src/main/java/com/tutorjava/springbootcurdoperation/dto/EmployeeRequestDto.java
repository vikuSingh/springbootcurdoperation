package com.tutorjava.springbootcurdoperation.dto;

import lombok.Data;

@Data
public class EmployeeRequestDto {
    private Long eid;
    private String ename;
    private String address;
    private String mobileNo;
}
