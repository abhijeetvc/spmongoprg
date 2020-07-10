package com.spmongo.spmongoprg.repository;

import com.spmongo.spmongoprg.model.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepository extends MongoRepository<Department,String> {
}
