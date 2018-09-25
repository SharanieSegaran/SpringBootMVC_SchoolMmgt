/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.schoommgt.repository;

/**
 *
 * @author ASUS
 */
import org.springframework.data.repository.CrudRepository;
import com.school.schoommgt.model.Student;
   

public interface StudentRepository extends CrudRepository<Student, Long> {

    public Object findById(int id);

    public void deleteById(int id);

}
