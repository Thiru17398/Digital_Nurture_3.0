package com.example.EmployeeManagementSystem.controller;


import com.example.EmployeeManagementSystem.entity.Department;
import com.example.EmployeeManagementSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping
    public List<Department> getAllDepartments(){
        return this.departmentRepository.findAll();
    }

    @PostMapping
    public Department createDepartment(@RequestBody Department department){
        return this.departmentRepository.save(department);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable Long id){
        return this.departmentRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Department> updateDepartment(@PathVariable Long id , @RequestBody Department updatedDepartment){
        return this.departmentRepository.findById(id)
                    .map(department -> {
                        department.setName(updatedDepartment.getName());
                        return ResponseEntity.ok(departmentRepository.save(department));
                    }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteDepartment(@PathVariable Long id){
        return this.departmentRepository.findById(id)
                .map(department -> {
                    departmentRepository.deleteById(id);
                    return ResponseEntity.noContent().build();
                }).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
