package com.example.springCRUD.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springCRUD.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{
    List <Student> findByName(String name);
}
