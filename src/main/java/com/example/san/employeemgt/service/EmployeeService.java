package com.example.san.employeemgt.service;

import com.example.san.employeemgt.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAllEmployees();

    Employee saveEmployee(Employee employee);
    boolean deleteEmployee(Long id);
    Employee updateEmployee(Employee employee);
    Optional<Employee> findEmployeeById(Long Id);
}
