package com.example.EmployeeManagementSystem.entity;


import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String name;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    public Department(){}

    public Department(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
