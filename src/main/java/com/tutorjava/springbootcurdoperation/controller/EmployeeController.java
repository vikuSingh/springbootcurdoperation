package com.tutorjava.springbootcurdoperation.controller;

import com.tutorjava.springbootcurdoperation.dto.EmployeeRequestDto;
import com.tutorjava.springbootcurdoperation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<?> saveEmp(@RequestBody EmployeeRequestDto employeeRequestDto) {
        return ResponseEntity.ok(employeeService.saveEmp(employeeRequestDto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> findAllEmp() {
        return ResponseEntity.ok(employeeService.getAllEmp());
    }

    @GetMapping("/findById/{empId}")
    public ResponseEntity<?> findById(@PathVariable("empId") String empId) {
        return ResponseEntity.ok(employeeService.findByIdEmp(Long.valueOf(empId)));
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateEmp(@RequestBody EmployeeRequestDto employeeRequestDto) {
        return ResponseEntity.ok(employeeService.updateEmp(employeeRequestDto));
    }

    @GetMapping("/deleteById/{empId}")
    public ResponseEntity<?> deleteById(@PathVariable("empId") String empId) {
         employeeService.deleteEmp(Long.valueOf(empId));
         return ResponseEntity.ok().build();
    }
}
