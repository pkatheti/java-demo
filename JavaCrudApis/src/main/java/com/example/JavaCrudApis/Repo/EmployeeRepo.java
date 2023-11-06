package com.example.JavaCrudApis.Repo;

import com.example.JavaCrudApis.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
