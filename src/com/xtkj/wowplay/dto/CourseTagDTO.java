// default package
package com.xtkj.wowplay.dto;





public class CourseTagDTO  {


     private int id;
     private CourseDTO course;
     private TagDTO tag;


    public CourseTagDTO() {
    }


    public CourseTagDTO(int id, CourseDTO course, TagDTO tag) {
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

    public CourseDTO getCourse() {
        return this.course;
    }
    
    public void setCourse(CourseDTO course) {
        this.course = course;
    }

    public TagDTO getTag() {
        return this.tag;
    }
    
    public void setTag(TagDTO tag) {
        this.tag = tag;
    }




}