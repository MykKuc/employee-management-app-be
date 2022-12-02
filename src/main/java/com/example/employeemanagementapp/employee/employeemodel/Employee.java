package com.example.employeemanagementapp.employee.employeemodel;



public class Employee {

    private Integer id;
    private String employeeName;
    private String employeeSurname;

    public Employee(Integer id, String employeeName, String employeeSurname) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
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
