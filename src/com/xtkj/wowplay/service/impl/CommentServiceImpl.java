package com.xtkj.wowplay.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.xtkj.wowplay.dao.CommentDao;
import com.xtkj.wowplay.entity.Comment;
import com.xtkj.wowplay.entity.Page;
import com.xtkj.wowplay.entity.Video;
import com.xtkj.wowplay.service.CommentService;

/**
 * 处理评论的业务实现层
 * @author Administrator
 *
 */
@Component("commentService")
public class CommentServiceImpl implements CommentService{

	private CommentDao commentDao;
	
	@Override
	public List<Comment> getAllCommentList(Video video) {
		List<Comment> commentList=new ArrayList<Comment>();
		commentList=commentDao.getAllComment(video);
		return commentList;
	}

	@Override
	public void deleteComment(Comment comment) {
		
	}

	@Override
	public void deleteAllCommetn(Video video) {
		
	}

	@Override
	public List<Comment> getAllCommentByPage(Video video, Page page) {
		List<Comment> commentList=null;
		commentList=commentDao.getAllComment(video);
		if(commentList==null){
			page.setTotalRecord(0);
		}else{
			page.setTotalRecord(commentList.size());
		}
		page=page.splitPage(page);
		commentList=commentDao.getCommentByPage(video, page);
		if(commentList!=null){	//查询所有的回复
			for(Comment comment:commentList){
				comment.setRepComment(commentDao.getRepComment(comment));
			}
		}
		return commentList;
	}

	@Override
	public void insertComment(Comment comment) {
		commentDao.insertComment(comment);
	}
	
	public CommentDao getCommentDao() {
		return commentDao;
	}
	
	@Resource(name="commentDao")
	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}
}
