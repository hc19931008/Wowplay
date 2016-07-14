// default package
package com.xtkj.wowplay.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "TB_TAG")
public class Tag implements Serializable {

    private int id;
    private String name;
    /**
     * sortid
     */
    private Sort sort;
    private Set courses = new HashSet(0);


    public Tag() {
    }

    public Tag(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Tag(int id, String name, Set courses) {
        this.id = id;
        this.name = name;
        this.courses = courses;
    }

    @Id
    @GeneratedValue
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

    @ManyToOne(cascade = CascadeType.ALL,targetEntity = Sort.class)
    @JoinColumn(name="sid")
    public Sort getSort() {
        return sort;
    }


    public void setSort(Sort sort) {
        this.sort = sort;
    }

    @ManyToMany(
            cascade = {CascadeType.PERSIST, CascadeType.MERGE},
            mappedBy = "tags",
            targetEntity = Course.class
    )
    public Set getCourses() {
        return this.courses;
    }

    public void setCourses(Set courses) {
        this.courses = courses;
    }


}