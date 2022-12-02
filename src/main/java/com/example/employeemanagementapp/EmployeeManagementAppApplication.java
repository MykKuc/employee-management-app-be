package com.example.employeemanagementapp;

import com.example.employeemanagementapp.employee.employeemodel.Employee;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Employee.class)
@MapperScan("com.example.employeemanagementapp.employee.employeemapper")
@SpringBootApplication
public class EmployeeManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementAppApplication.class, args);
	}

}
