package com.example.san.employeemgt.repository;

import com.example.san.employeemgt.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    //public List<Employee> findAll();
    /*{
        List<Employee> employeeList = Arrays.asList(
                new Employee(100L, "Jane", "Fox", "aa@aa.com"),
                new Employee(101L, "Lina", "GG", "bb@bb.com")
        );
        return employeeList;
    }*/
}
