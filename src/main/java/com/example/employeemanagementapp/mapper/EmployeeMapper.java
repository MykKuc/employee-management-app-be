package com.example.employeemanagementapp.mapper;


import com.example.employeemanagementapp.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("SELECT * FROM employee;")
    List<Employee> findAll();

}
