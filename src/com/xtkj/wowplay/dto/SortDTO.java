// default package
package com.xtkj.wowplay.dto;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;



public class SortDTO{
     private int id;
     private String name;
     private int pid;
     private String tags ;

    public SortDTO() {
    }

    public SortDTO(int id, String name, int pid) {
        this.id = id;
        this.name = name;
        this.pid = pid;

    }

    public SortDTO(int id, String name, int pid,String tags) {
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.tags=tags;
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

    public int getPid() {
        return this.pid;
    }
    
    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}