package com.example.JavaCrudApis.controller;

import com.example.JavaCrudApis.Entity.Employee;
import com.example.JavaCrudApis.Entity.Workers;
import com.example.JavaCrudApis.Repo.EmployeeRepo;
import com.example.JavaCrudApis.Repo.WorkersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController

public class userContoller {
    @Autowired
    private EmployeeRepo employeeRepo;
    private WorkersRepo workersRepo ;

    @PostMapping("/createUser")
    public String creteEmployee(@RequestBody Employee employee) {
      employeeRepo.save(employee);
      return "created";
    }
//    @PostMapping("createWorker")
//    public String creteWorker(@RequestBody Workers workers) {
//        workersRepo.save(workers);
//        return "Worker created";
//    }
    @GetMapping("/getUsers")
    public List <Employee> getUsers() {
      return   employeeRepo.findAll();

    }
    @GetMapping("/hello")
    public String  getHello() {
     return  "Hello worlds";
    }


    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser (@PathVariable  (name="id")Integer id) {
        employeeRepo.deleteById(id);
            return "User Deleted";
    }

    @PutMapping("updateUser/{id}")
    public String updateUser(@PathVariable (name = "id") Integer id , @RequestBody Employee employee)  {
        Optional value =  employeeRepo.findById(id);
        if (value.isPresent()) {
            employeeRepo.save(employee);
            return  "userUpdate";
        }else {
            return "Faild";
        }
    }


}
