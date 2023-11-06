package com.example.JavaCrudApis.controller;


import com.example.JavaCrudApis.Entity.Workers;
import com.example.JavaCrudApis.Repo.WorkersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class workersControllers {
    @Autowired
    private WorkersRepo workersRepo;

    @PostMapping("/createWorker")
    public String createWorker(@RequestBody Workers  worker) {
        workersRepo.save(worker);
        return "Worker Created Susscussfully";
    }

}
