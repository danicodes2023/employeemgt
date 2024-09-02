package com.example.san.employeemgt.service;

import com.example.san.employeemgt.entity.Employee;

import java.util.List;
public interface EmployeeService {
    List<Employee> listEmployees();

    Employee saveEmployee(Employee employee);
}
