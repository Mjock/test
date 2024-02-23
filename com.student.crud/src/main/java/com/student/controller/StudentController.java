package com.student.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


import com.student.entity.Student;
import com.student.service.StudentService;
@Controller
public class StudentController {
	@Autowired
	StudentService service;
	
      @PostMapping("/add")
      public String addStudent(@ModelAttribute Student st){
    	 service.addStudent(st);
    	  return "index";
      }
      @GetMapping("/get")
      public String getStudent(@RequestParam("roll")int roll,Model model) {
    	  Student st=service.getStudent(roll);
    	  
    	  model.addAttribute("student", st);
    	  System.out.println(st);
    	  return "displayStudent";
      } 
      @GetMapping("/getAll")
      public String getAllStudents(Model model) {
    	  List<Student> stList=service.getAllStudents();
    	  model.addAttribute("stList", stList);
    	  return "displayAll";
      }
      @PostMapping("/update")
      public String updateStudent(@ModelAttribute Student st) {
    	  service.updateStudent(st);
    	  return "index";
      }
      @GetMapping("/delete")
      public String delStudent(@RequestParam("roll")int roll) {
    	 service.delStudent(roll);

   	  return "index";
    	  

    	  
      }
	}


