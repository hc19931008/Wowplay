package com.xtkj.wowplay.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.opensymphony.xwork2.ActionSupport;

import com.opensymphony.xwork2.ActionContext;


/**
 * 获取servlet API
 * @author Wangyan
 *
 */
public class BaseAction extends ActionSupport {


	private  ActionContext ctx = ActionContext.getContext();
	
	public HttpServletRequest getRequest(){
		return  (HttpServletRequest) ctx.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
	}
	
	public  Map<String,Object> getSession(){
		
		return ctx.getSession();
	}
	
	public  Map<String,Object> getApplication(){
		
		return ctx.getApplication();
	}
	
	public  HttpServletResponse getResponse(){
		return (HttpServletResponse) ctx.get(org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
	}
	
}
