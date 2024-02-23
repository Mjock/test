package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {


public void addStudent(Student st);
public Student getStudent(int roll);
public List<Student> getAllStudents();
public void updateStudent(Student st);
public void delStudent(int roll);


}
