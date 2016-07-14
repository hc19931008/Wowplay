// default package
package com.xtkj.wowplay.dto;


import java.util.HashSet;
import java.util.Set;


public class TagDTO  {


     private String id;
     private String name;
     private Set courseTags = new HashSet(0);

     private String courseId;
     

    public TagDTO() {
    }

    public TagDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }
    

    public TagDTO(String id, String name, Set courseTags) {
        this.id = id;
        this.name = name;
        this.courseTags = courseTags;
    }

   

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Set getCourseTags() {
        return this.courseTags;
    }
    
    public void setCourseTags(Set courseTags) {
        this.courseTags = courseTags;
    }

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
   








}