package com.example.employeemanagementapp.employee.employeemodel;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer id;

    @NotBlank(message = "Name field can not be empty.")
    @Column(name = "employee_name")
    private String employeeName;

    @NotBlank(message = "Surname field can not be empty.")
    @Column(name = "employee_surname")
    private String employeeSurname;

    public Employee(Integer id, String employeeName, String employeeSurname) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
    }

    public Employee() {
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public void setEmployeeSurname(String employeeSurname) {
        this.employeeSurname = employeeSurname;
    }
}
