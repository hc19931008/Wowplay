package com.xtkj.wowplay.action;

import javax.annotation.Resource;

import com.xtkj.wowplay.service.BackLoginService;

public class BackLoginAction extends BaseAction {
	private  BackLoginService backLoginService;
	private String userName;
	private String passWord;
	
	public String checkLogin(){
		String message=null; 
		boolean a=backLoginService.checkLogin(userName,passWord);
		if(a){
			message="success";
		}else {
			message="fail";
		}
		return message;
	}
	
	public BackLoginService getBackLoginService() {
		return backLoginService;
	}
	
	@Resource(name = "backLoginService")
	public void setBackLoginService(BackLoginService backLoginService) {
		this.backLoginService = backLoginService;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
