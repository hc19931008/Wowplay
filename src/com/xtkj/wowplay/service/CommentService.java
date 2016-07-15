package com.xtkj.wowplay.service;

import java.util.List;

import com.xtkj.wowplay.entity.Comment;
import com.xtkj.wowplay.entity.Page;
import com.xtkj.wowplay.entity.Video;

public interface CommentService {

	/**查询某视频的所有评论*/
	public List<Comment> getAllCommentList(Video video);
	
	/** 删除指定的评论*/
	public void deleteComment(Comment comment);
	
	/**删除某视频的所有的评论*/
	public void deleteAllCommetn(Video video);
	
	/**分页查询某视频下的所有评论*/
	public List<Comment> getAllCommentByPage(Video video,Page page);
	
	/**添加评论*/
	public void insertComment(Comment comment);
}
