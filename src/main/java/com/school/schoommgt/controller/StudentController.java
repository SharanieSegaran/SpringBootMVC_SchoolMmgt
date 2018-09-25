/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.schoommgt.controller;

/**
 *
 * @author ASUS
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.school.schoommgt.model.Student;
import com.school.schoommgt.service.StudentService;


@Controller
@RequestMapping(value="/student")
public class StudentController {

 @Autowired
 StudentService studentService;
 
 @RequestMapping(value="/list", method=RequestMethod.GET)
 public ModelAndView list() {
  ModelAndView model = new ModelAndView("student_list");
  List<Student> studentList = studentService.getAllStudents();
  model.addObject("studentList", studentList);
  
  return model;
 }
 
 @RequestMapping(value="/addStudent/", method=RequestMethod.GET)
 public ModelAndView addStudent() {
  ModelAndView model = new ModelAndView();
  
  Student student = new Student();
  model.addObject("studentForm", student);
  model.setViewName("student_form");
  
  return model;
 }
 
 @RequestMapping(value="/updateArticle/{id}", method=RequestMethod.GET)
 public ModelAndView editStudent(@PathVariable long id) {
  ModelAndView model = new ModelAndView();
  
  Student student = studentService.getStudentById((int) id);
  model.addObject("studentForm", student);
  model.setViewName("student_form");
  
  return model;
 }
 
 @RequestMapping(value="/saveStudent", method=RequestMethod.POST)
 public ModelAndView save(@ModelAttribute("studentForm") Student student) {
  studentService.saveOrUpdate(student);
  
  return new ModelAndView("redirect:/student/list");
 }
 
 @RequestMapping(value="/deleteArticle/{id}", method=RequestMethod.GET)
 public ModelAndView delete(@PathVariable("id") int id) {
  studentService.deleteStudent(id);
  
  return new ModelAndView("redirect:/student/list");
 }
}