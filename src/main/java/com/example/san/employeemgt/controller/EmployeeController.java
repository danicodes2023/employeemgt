package com.example.san.employeemgt.controller;

import com.example.san.employeemgt.entity.Employee;
import com.example.san.employeemgt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("api/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping
    ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employeeList= employeeService.listEmployees();
        return ResponseEntity.ok(employeeList);
    }
    @PostMapping
    ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        Employee savedEmployee;
        savedEmployee = employeeService.saveEmployee(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);

    }
}
