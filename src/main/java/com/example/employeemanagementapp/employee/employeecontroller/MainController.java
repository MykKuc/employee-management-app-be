package com.example.employeemanagementapp.employee.employeecontroller;


import com.example.employeemanagementapp.employee.employeemodel.Employee;
import com.example.employeemanagementapp.employee.employeeservices.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// https://employeemanagementapp.com
@RestController
@CrossOrigin(origins = "http://localhost:3001")
@RequestMapping("employee")
public class MainController {

   private EmployeeService employeeService;

   public MainController(EmployeeService employeeService){
       this.employeeService = employeeService;
   }

    @GetMapping("/hey")
    public static String getHey() {
        return "Is this working";
    }


    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    public void postEmployee(@RequestBody Employee employee){
        employeeService.insertEmployeeService(employee);
    }

}
