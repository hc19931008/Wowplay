package com.xtkj.wowplay.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.json.JSONException;
import org.apache.struts2.json.JSONUtil;

import com.xtkj.wowplay.dto.CommentDTO;
import com.xtkj.wowplay.entity.Comment;
import com.xtkj.wowplay.entity.Page;
import com.xtkj.wowplay.entity.Video;
import com.xtkj.wowplay.service.impl.CommentServiceImpl;


/**
 * 
 * @author Wangyan
 *
 */
public class CommentAction extends BaseAction {

	private CommentServiceImpl commentServiceImpl;
	private Comment comment;
	private CommentDTO commentDTO;
	private List<Comment> commentList;
	private Map<String,Object> ajaxMap;
	
	/** 添加评论
	 * @throws JSONException 
	 * @throws IOException */
	public void insertComment() throws IOException, JSONException{
		commentServiceImpl.insertComment(comment);
		Page page=new Page();
		commentList=commentServiceImpl.getAllCommentByPage(comment.getVideo(), page);
		ajaxMap=new HashMap<String,Object>();
		ajaxMap.put("commentList", commentList);
		ajaxMap.put("page", page);
		//输出流配置
		this.getResponse().getWriter().print(JSONUtil.serialize(ajaxMap));
		
	}
		
	/**
	 * 分页查询评论
	 * @return
	 * @throws JSONException 
	 * @throws IOException 
	 */
	public void getCommentListByPage() throws IOException, JSONException{
		Page page=new Page();
		commentList=commentServiceImpl.getAllCommentByPage(comment.getVideo(), page);
		this.getResponse().getWriter().print(JSONUtil.serialize(commentList));
	}
	
	/**
	 * 查询某个视频的所有评论
	 * @return
	 * @throws JSONException 
	 * @throws IOException 
	 */
	public void getCommentByVideo() throws IOException, JSONException{
		Video video=new Video();
		video.setId(comment.getId());
		commentList=commentServiceImpl.getAllCommentList(video);
		this.getResponse().getWriter().print(JSONUtil.serialize(commentList));
	}
	
	public CommentServiceImpl getCommentServiceImpl() {
		return commentServiceImpl;
	}
	
	@Resource(name="commentService")
	public void setCommentServiceImpl(CommentServiceImpl commentServiceImpl) {
		this.commentServiceImpl = commentServiceImpl;
	}
}
