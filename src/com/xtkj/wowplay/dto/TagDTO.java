// default package
package com.xtkj.wowplay.dto;


import java.util.HashSet;
import java.util.Set;


public class TagDTO  {


     private int id;
     private String name;
     private Set courses = new HashSet(0);

     private String courseId;
     

    public TagDTO() {
    }

    public TagDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }
    

    public TagDTO(int id, String name, Set courseTags) {
        this.id = id;
        this.name = name;
        this.courses = courseTags;
    }

   

    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Set getCourses() {
        return this.courses;
    }
    
    public void setCourses(Set courses) {
        this.courses = courses;
    }

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
   








}