package com.xtkj.wowplay.dao;

/**
 * Created by hc on 2016/7/16 
 * 后台登录
 */
public interface BackLoginDao {
	/**
	 * Created by hc on 2016/7/16 
	 * 后台登录验证方法
	 */
	public boolean checkLogin(String userName,String passWord);
}
