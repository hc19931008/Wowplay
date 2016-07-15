package com.xtkj.wowplay.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 与数据库进行交互的dto
 * @author Administrator
 *
 */

public class CommentDTO implements Serializable{

	private String id;
	private String content;
	private Date date;
	private UserDTO user;
	private VideoDTO video;
	
	public CommentDTO(String id, String content, Date date, UserDTO user,
			VideoDTO video) {
		super();
		this.id = id;
		this.content = content;
		this.date = date;
		this.user = user;
		this.video = video;
	}
	
	public CommentDTO() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public VideoDTO getVideo() {
		return video;
	}

	public void setVideo(VideoDTO video) {
		this.video = video;
	}
	
	
}
