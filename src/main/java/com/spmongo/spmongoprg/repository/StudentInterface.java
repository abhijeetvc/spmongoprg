package com.spmongo.spmongoprg.repository;

import com.spmongo.spmongoprg.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentInterface extends MongoRepository<Student,String> {
}
