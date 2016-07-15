package com.xtkj.wowplay.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 视频评论
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="TB_COMMENT")
public class Comment implements Serializable{

	private int id;			//评论id
	private String content;	//评论内容
	private String time;	//评论时间
	private int pid;		//评论级别
	private Video video;	//评论对应的视频
	private User user;	    //评论对应的用户
	
	private int videoId;	//评论对应视频id
    private String videoname;	//评论对应视频名字
    private String username;	//学员名
    
    private List<Comment> repComment;	//回复
    
	public Comment() {
		
	}

	public Comment(int id, String content, String time, int pid, Video video,
			User user) {
		this.id = id;
		this.content = content;
		this.time = time;
		this.pid = pid;
		this.video = video;
		this.user = user;
	}


	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="CONTENT",length=3000)
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	@Column(name="TIME",length=50)
	public String getTime() {
		return time;
	}
	
	@Column(name="PID")
	public void setTime(String time) {
		this.time = time;
	}
	
	public int getPid() {
		return pid;
	}
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="VIDEOID")
	public Video getVideo() {
		return video;
	}
	
	public void setVideo(Video video) {
		this.video = video;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}	
	
	public int getVideoId() {
		return videoId;
	}
	
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	
	public String getVideoname() {
		return videoname;
	}
	
	public void setVideoname(String videoname) {
		this.videoname = videoname;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public List<Comment> getRepComment() {
		return repComment;
	}
	
	public void setRepComment(List<Comment> repComment) {
		this.repComment = repComment;
	}
	
}
