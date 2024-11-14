package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.entity.Department;
import com.example.EmployeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    @Query("Select e from Employee e")
    List<Employee> findByName(@Param("name") String name);

    @Query("Select e from Employee e where e.mail = :mail")
    List<Employee> findByMail(@Param("mail") String mail);

    @Query("Select e from Employee e join e.department d where d.name = :departmentName")
    List<Employee> findByDepartmentName(@Param("departmentName") String departmentName);
}
