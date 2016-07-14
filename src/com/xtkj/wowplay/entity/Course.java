// default package
package com.xtkj.wowplay.entity;


import javax.persistence.*;
import java.io.File;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="tb_course")
public class Course implements Serializable{

     private int id;
     private Sort sort;
     private String coursename;
     private String picpath;
     private String author;
     private String CDesc;
     private Set tags = new HashSet(0);

     private File upload;

     private int loadCount;
     private int haveStudent;

    public Course() {
    }

    public Course(int id, Sort sort, String coursename, String picpath, String author, String CDesc) {
        this.id = id;
        this.sort = sort;
        this.coursename = coursename;
        this.picpath = picpath;
        this.author = author;
        this.CDesc = CDesc;
    }
    

    public Course(int id, Sort sort, String coursename, String picpath, String author, String CDesc, Set courseTags) {
        this.id = id;
        this.sort = sort;
        this.coursename = coursename;
        this.picpath = picpath;
        this.author = author;
        this.CDesc = CDesc;
        this.tags = courseTags;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=Sort.class )
    @JoinColumn(name="SORTID")
    public Sort getSort() {
        return this.sort;
    }
    
    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public String getCoursename() {
        return this.coursename;
    }
    
    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getPicpath() {
        return this.picpath;
    }
    
    public void setPicpath(String picpath) {
        this.picpath = picpath;
    }

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    @Column(name="C_DESC")
    public String getCDesc() {
        return this.CDesc;
    }
    
    public void setCDesc(String CDesc) {
        this.CDesc = CDesc;
    }

    @ManyToMany(
            targetEntity=Tag.class,
            cascade={CascadeType.PERSIST, CascadeType.MERGE}
    )
    @JoinTable(
            name="TB_COURSE_TAG",
            joinColumns=@JoinColumn(name="COURSEID"),
            inverseJoinColumns=@JoinColumn(name="TAGID")
    )
    public Set getTags() {
        return this.tags;
    }
    
    public void setTags(Set tags) {
        this.tags = tags;
    }

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public int getLoadCount() {
		return loadCount;
	}

	public void setLoadCount(int loadCount) {
		this.loadCount = loadCount;
	}

	public int getHaveStudent() {
		return haveStudent;
	}

	public void setHaveStudent(int haveStudent) {
		this.haveStudent = haveStudent;
	}
   








}