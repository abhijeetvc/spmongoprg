package com.spmongo.spmongoprg.controller;

import com.spmongo.spmongoprg.model.Student;
import com.spmongo.spmongoprg.repository.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentInterface studentInterface;

    @PostMapping(value="/save")
    public String saveEmp(@RequestBody Student student){
        studentInterface.save(student);
        return "Student saved";
    }

    @GetMapping(value="/getstu/{id}")
    public Optional<Student> getStudent(@PathVariable String id){
        return studentInterface.findById(id);
    }
}
