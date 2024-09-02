package com.example.san.employeemgt.controller;

import com.example.san.employeemgt.entity.Employee;
import com.example.san.employeemgt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("api/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping
    ResponseEntity<List<Employee>> listEmployees(){
        List<Employee> employeeList= employeeService.listEmployees();
        return ResponseEntity.ok(employeeList);
    }
}
