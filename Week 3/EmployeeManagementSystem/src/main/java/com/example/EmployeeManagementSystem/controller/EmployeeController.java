package com.example.EmployeeManagementSystem.controller;


import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getEmployees(){
        return this.employeeRepository.findAll();
    }

    @PostMapping
    public Employee insertEmployee(@RequestBody Employee employee){
        return this.employeeRepository.save(employee);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
        return this.employeeRepository.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee updatedEmployee){
        return this.employeeRepository.findById(id).map(employee -> {
            employee.setName(updatedEmployee.getName());
            employee.setMail(updatedEmployee.getMail());
            employee.setDepartment(updatedEmployee.getDepartment());
            return ResponseEntity.ok(employeeRepository.save(employee));
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteEmployee(@PathVariable Long id) {
        return employeeRepository.findById(id).map(employee -> {
            employeeRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
