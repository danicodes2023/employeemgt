package com.example.san.employeemgt.service;

import com.example.san.employeemgt.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
public interface EmployeeService {
    List<Employee> listEmployees();
}
