package com.example.employeemanagementapp.employee.employeeservices;

import com.example.employeemanagementapp.employee.employeemapper.EmployeeMapper;
import com.example.employeemanagementapp.employee.employeemodel.Employee;
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

    public void insertEmployeeService(Employee employee){
        employeeMapper.insertOneEmployee(employee);
    }
}
