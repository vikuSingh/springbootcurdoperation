package com.tutorjava.springbootcurdoperation.service;

import com.tutorjava.springbootcurdoperation.dto.EmployeeRequestDto;
import com.tutorjava.springbootcurdoperation.model.Employee;
import com.tutorjava.springbootcurdoperation.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmp(EmployeeRequestDto employeeRequestDto) {
        Employee employee = new Employee();
        employee.setEname(employeeRequestDto.getEname());
        employee.setAddress(employeeRequestDto.getAddress());
        employee.setMobileNo(employeeRequestDto.getMobileNo());
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmp() {
        return employeeRepository.findAll();
    }

    public Employee findByIdEmp(Long empId) {
        return employeeRepository.findById(empId).get();
    }

    public void deleteEmp(Long empId) {
        employeeRepository.deleteById(empId);
    }

    public Employee updateEmp(EmployeeRequestDto employeeRequestDto) {
        Employee employee = new Employee();
        employee.setEid(employeeRequestDto.getEid());
        employee.setEname(employeeRequestDto.getEname());
        employee.setAddress(employeeRequestDto.getAddress());
        employee.setMobileNo(employeeRequestDto.getMobileNo());
        return employeeRepository.save(employee);
    }
}
