package com.example.employeemanagementapp.employee.employeeservices;

import com.example.employeemanagementapp.employee.employeerepository.EmployeeRepository;
import com.example.employeemanagementapp.employee.employeemodel.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }


    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public void insertEmployeeService(Employee employee){
        employeeRepository.save(employee);
    }

    public void deleteEmployeeById(int id){
        employeeRepository.deleteById(id);

    }
}
