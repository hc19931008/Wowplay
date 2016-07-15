package com.xtkj.wowplay.entity;


import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="TB_ROLE")
public class Role implements Serializable{

	private int id;			//角色id
	private String name;	//角色名称
	private String status;	//角色状态
	private Set<User> user;	//角色对应的用户
	
    public Role(){
		
	} 
    
    @Id
    @GeneratedValue
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	@Column(name="NAME",length=20)
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Column(name="STATUS",length=10)
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="ROLEID")
	public Set<User> getUser() {
		return user;
	}
	
	public void setUser(Set<User> user) {
		this.user = user;
	}
}

