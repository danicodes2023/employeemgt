package com.example.san.employeemgt.service;

import com.example.san.employeemgt.entity.Employee;
import com.example.san.employeemgt.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public List<Employee> findAllEmployees() {
        log.info("findAllEmployees");
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        log.info("saveEmployee");
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        log.info("deleteEmployee {}", id);
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        log.info("updateEmployee {}", employee);
        return employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> findEmployeeById(Long id) {
        log.info("findEmployeeById {}", id);
        return employeeRepository.findById(id);
    }
}
