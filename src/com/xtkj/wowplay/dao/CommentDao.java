package com.xtkj.wowplay.dao;

import java.util.List;

import com.xtkj.wowplay.entity.Comment;
import com.xtkj.wowplay.entity.Page;
import com.xtkj.wowplay.entity.Video;

public interface CommentDao {

	/**添加评论*/
	public void insertComment(Comment comment);
	
	/**删除某个评论*/
	public void deleteComment(Comment comment);
	
	/**根据id查询某个评论*/
	public Comment findCommentById(Comment comment);
	
	/**查询某个视频的所有评论*/
	public List<Comment> getAllComment(Video video);
	
	/**查询评论的回复*/
	public List<Comment> getRepComment(Comment comment);
	
	/**删除某个视频的所有评论*/
	public void deleteAllComment(Video video);
	
	/**分页显示某个视频的所有评论*/
	public List<Comment> getCommentByPage(Video video,Page page);
	
	/***/
}
