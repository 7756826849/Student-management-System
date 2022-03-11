package com.example.Student.management.System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Student.management.System.entity.Student;


@Repository
public interface SudentRepository extends JpaRepository<Student,Long>{

}
