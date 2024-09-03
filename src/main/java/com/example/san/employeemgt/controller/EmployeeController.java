package com.example.san.employeemgt.controller;

import com.example.san.employeemgt.entity.Employee;
import com.example.san.employeemgt.service.EmployeeService;
import org.apache.catalina.filters.ExpiresFilter;
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
    ResponseEntity<List<Employee>> findAllEmployees(){
        List<Employee> employeeList= employeeService.findAllEmployees();
        return ResponseEntity.ok(employeeList);
    }
    @PostMapping
    ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        Employee savedEmployee;
        savedEmployee = employeeService.saveEmployee(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);

    }
    @GetMapping("/{id}")
    ResponseEntity<Employee> findEmployeeById(@PathVariable Long id){
        Employee foundEmployee = employeeService.findEmployeeById(id).get();
        return ResponseEntity.ok(foundEmployee);
    }
    @DeleteMapping("/{id}")
    ResponseEntity<Boolean> deleteEmployee(@PathVariable Long id){
        boolean deleted = employeeService.deleteEmployee(id);
        return new ResponseEntity<>(deleted, HttpStatus.OK);
    }
    @PutMapping
    ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        Employee updatedEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }
}
