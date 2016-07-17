package com.xtkj.wowplay.service;

/**
 * Created by hc on 2016/7/16 
 * 后台登录
 */
public interface BackLoginService {
	/**
	 * Created by hc on 2016/7/16 
	 * 后台登录验证方法
	 */
	boolean checkLogin(String userName,String passWord);
}
