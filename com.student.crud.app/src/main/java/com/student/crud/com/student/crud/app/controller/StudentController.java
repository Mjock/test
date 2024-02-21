package com.student.crud.com.student.crud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.crud.com.student.crud.app.entity.Student;
import com.student.crud.com.student.crud.app.services.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
      @PostMapping("/add")
      public String addStudent(@RequestBody Student st){
    	 service.addStudent(st);
    	  return "Student added successfully!!";
      }
      @GetMapping("/get")
      public Student getStudent(@RequestParam("roll")int roll) {
    	  Student st=service.getStudent(roll);
    	  return st;
      } 
      @GetMapping("/getAll")
      public List<Student> getAllStudents() {
    	  List<Student> stList=service.getAllStudents();
    	  return stList;
      }
      @PutMapping("/update")
      public String updateStudent(@RequestBody Student st) {
    	  service.updateStudent(st);
    	  return "Student updated successfully!!";
      }
      @DeleteMapping("/delete")
      public String delStudent(@RequestParam("roll")int roll) {
    	 service.delStudent(roll);
    	  return "Student deleted successfully!!";
      }
}
