// default package
package com.xtkj.wowplay.entity;


import javax.persistence.Entity;
import java.io.Serializable;


public class CourseTag implements Serializable {


     private int id;
     private Course course;
     private Tag tag;


    public CourseTag() {
    }

    public CourseTag(int id, Course course, Tag tag) {
        this.id = id;
        this.course = course;
        this.tag = tag;
    }


    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }

    public Tag getTag() {
        return this.tag;
    }
    
    public void setTag(Tag tag) {
        this.tag = tag;
    }
   








}