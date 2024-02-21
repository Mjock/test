package com.student.crud.com.student.crud.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.student.crud.com.student.crud.app.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
