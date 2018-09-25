/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.schoommgt.model;

/**
 *
 * @author ASUS
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements Serializable {

 @Id
 private int id;
 
 @Column(name="name")
 private String name;
 
 @Column(name="ic")
 private String ic;

 @Column(name="gender")
 private String gender;
 
 @Column(name="contact")
 private String contact;
  
 @Column(name="email")
 private String email;
 
 @Column(name="courseid")
 private String courseid;
 
 @Column(name="intakecode")
 private String intakecode;

 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getIntakecode() {
        return intakecode;
    }

    public void setIntakecode(String intakecode) {
        this.intakecode = intakecode;
    }
 
 
}