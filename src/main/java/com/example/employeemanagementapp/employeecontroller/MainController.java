package com.example.employeemanagementapp.employeecontroller;


import com.example.employeemanagementapp.mapper.EmployeeMapper;
import com.example.employeemanagementapp.model.Employee;
import com.example.employeemanagementapp.services.EmployeeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://employeemanagementapp.com/list")
public class MainController {

   private EmployeeService employeeService;

   public MainController(EmployeeService employeeService){
       this.employeeService = employeeService;
   }

    @GetMapping("/hey")
    public static String getHey() {
        return "Is this working";
    }


    @GetMapping("/all")
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

}
