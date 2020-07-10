package com.spmongo.spmongoprg.controller;

import com.spmongo.spmongoprg.model.Department;
import com.spmongo.spmongoprg.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping(value="/savedept")
    public String saveDept(@RequestBody Department department){
        departmentRepository.save(department);
        return "Dept saved";
    }
}
