package com.xtkj.wowplay.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xtkj.wowplay.dao.BackLoginDao;
import com.xtkj.wowplay.service.BackLoginService;

/**
 * Created by hc on 2016/7/16 
 * 后台登录
 */
@Service("backLoginService")
public class BackLoginServiceImpl implements BackLoginService {
	private BackLoginDao backLoginDao;
	/**
	 * Created by hc on 2016/7/16 
	 * 后台登录验证方法Service
	 * 验证成功:true
	 * 验证失败:false
	 */
	@Override
	public boolean checkLogin(String userName, String passWord) {
		return backLoginDao.checkLogin(userName, passWord);
	}
	
	public BackLoginDao getBackLoginDao() {
		return backLoginDao;
	}
	
	@Resource(name="backLoginDao")
	public void setBackLoginDao(BackLoginDao backLoginDao) {
		this.backLoginDao = backLoginDao;
	}
	

}
