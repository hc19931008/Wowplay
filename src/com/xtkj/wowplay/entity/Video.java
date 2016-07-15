package com.xtkj.wowplay.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="TB_VIDEO")
@SequenceGenerator(name="XXX",sequenceName="SEQ_VIDEO",initialValue=1,allocationSize=1)
public class Video implements Serializable{

	private int id;				//视频id
	private String videoName;	//视频名称
	private int clickNum;		//点击数
	private String path;		//视频存放路径
	private String ext;			//视频格式
	private String commstate;	//评论状态
	private String showstate;	//视频展示状态
	private Date date;			//上传时间
	
	private Course course;		//视频对应的课程
	private Set<Comment> comments;	//视频对应的评论

	public Video() {
		
	}

	@Id
	@GeneratedValue(generator="XXX",strategy=GenerationType.SEQUENCE)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="VIDEONAME",length=100)
	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	@Column(name="CLICKNUM")
	public int getClickNum() {
		return clickNum;
	}

	public void setClickNum(int clickNum) {
		this.clickNum = clickNum;
	}

	@Column(name="PATH",length=100)
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Column(name="EXT",length=100)
	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	@Column(name="COMMSTATE",length=10)
	public String getCommstate() {
		return commstate;
	}

	public void setCommstate(String commstate) {
		this.commstate = commstate;
	}

	@Column(name="SHOWSTATE",length=10)
	public String getShowstate() {
		return showstate;
	}

	public void setShowstate(String showstate) {
		this.showstate = showstate;
	}

	@Column(name="TIME")
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="COURSEID")
	public Course getCourse() {
		return course;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@Column(name="VIDEOID")
	public Set<Comment> getComments() {
		return comments;
	}
	
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	
}
