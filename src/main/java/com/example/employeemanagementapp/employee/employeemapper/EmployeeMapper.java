package com.example.employeemanagementapp.employee.employeemapper;


import com.example.employeemanagementapp.employee.employeemodel.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("SELECT * FROM employee;")
    List<Employee> findAll();

    @Insert("INSERT INTO employee (employee_name,employee_surname)" +
            "VALUES (#{employeeName}, #{employeeSurname})")
    void insertOneEmployee(Employee employee);

    @Delete("DELETE FROM employee WHERE employee_id = #{id} ")
    boolean deleteById(int id);
}
