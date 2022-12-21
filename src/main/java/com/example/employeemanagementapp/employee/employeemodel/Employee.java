package com.example.employeemanagementapp.employee.employeemodel;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer employeeId;

    @Column(name = "firstname")
    private String employeeName;

    @Column(name = "lastname")
    private String employeeSurname;

    @Column(name = "salary")
    private Integer salary;

}
