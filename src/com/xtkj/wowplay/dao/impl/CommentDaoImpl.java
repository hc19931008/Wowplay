package com.xtkj.wowplay.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.xtkj.wowplay.dao.BaseDao;
import com.xtkj.wowplay.dao.CommentDao;
import com.xtkj.wowplay.entity.Comment;
import com.xtkj.wowplay.entity.Page;
import com.xtkj.wowplay.entity.Video;

@Component("commentDao")
public class CommentDaoImpl implements CommentDao {

	private BaseDao baseDaoImpl;

	@Override
	public void insertComment(Comment comment) {
		baseDaoImpl.save(comment);
	}
	
	@Override
	public void deleteComment(Comment comment) {
		baseDaoImpl.delete(comment);
	}

	@Override
	public Comment findCommentById(Comment comment) {
		String hql="from Comment as model where model.id=?";
		Object[] value={comment.getId()};
		return (Comment) baseDaoImpl.findByHql(hql, value).get(0);
	}

	@Override
	public List<Comment> getAllComment(Video video) {
		String hql="from Comment as model where model.video.id=?";
		Object[] value={video.getId()};
		return baseDaoImpl.findByHql(hql, value);
	}

	@Override
	public List<Comment> getRepComment(Comment comment) {
		String hql="from Comment as model where model.pid=?";
		Object[] value={comment.getPid()};
		return baseDaoImpl.findByHql(hql, value);
	}
	
	@Override
	public void deleteAllComment(Video video) {
		Object[] value={video.getId()};
		String hql="delete from Comment as model where model.video.id=?";
		baseDaoImpl.deleteByHql(hql, value);
	}

	@Override
	public List<Comment> getCommentByPage(Video video, Page page) {
		String hql="from Comment as model where model.video.id="+video.getId();
		int start=(page.getCurrentPage()-1)*page.getRows();
		int limit=page.getRows();
		return baseDaoImpl.findByHql(hql, start, limit);
	}
	
	public BaseDao getBaseDaoImpl() {
		return baseDaoImpl;
	}
	
	@Resource(name="baseDao")
	public void setBaseDaoImpl(BaseDao baseDaoImpl) {
		this.baseDaoImpl = baseDaoImpl;
	}
}
