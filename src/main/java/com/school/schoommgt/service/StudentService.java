/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.schoommgt.service;

/**
 *
 * @author ASUS
 */
import java.util.List;
import com.school.schoommgt.model.Student;

public class StudentService {

public List<Student> getAllStudents();
        
 public Student getStudentById(int id);
 
 public void saveOrUpdate(Student student);
 
 public void deleteStudent(int id);


}