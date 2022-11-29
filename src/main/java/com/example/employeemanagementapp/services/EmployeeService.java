package com.example.employeemanagementapp.services;

import com.example.employeemanagementapp.mapper.EmployeeMapper;
import com.example.employeemanagementapp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeMapper employeeMapper;

    public EmployeeService(EmployeeMapper employeeMapper){
        this.employeeMapper = employeeMapper;
    }

    public List<Employee> getAllEmployees(){
        return employeeMapper.findAll();

    }
}
