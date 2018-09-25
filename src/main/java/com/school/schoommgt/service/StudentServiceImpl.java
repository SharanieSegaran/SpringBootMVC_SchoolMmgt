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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.school.schoommgt.model.Student;
import com.school.schoommgt.repository.StudentRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class StudentServiceImpl {
    
 StudentRepository studentRepository;


 public List<Student> getAllStudents() {
  return (List<Student>) studentRepository.findAll();
 }


 public Student getStudentById(int id) {
  return studentRepository.findById(id).get();
 }


 public void saveOrUpdate(Student student) {
  studentRepository.save(student);
 }


 public void deleteStudent(int id) {
  studentRepository.deleteById(id);
 }


}

