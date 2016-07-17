package com.xtkj.wowplay.dao.impl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.xtkj.wowplay.dao.BackLoginDao;
import com.xtkj.wowplay.dao.BaseDao;
import com.xtkj.wowplay.dto.UserDTO;
import com.xtkj.wowplay.entity.User;

/**
 * Created by hc on 2016/7/16 
 * 后台登录
 */
@Repository("backLoginDao")
public class BackLoginDaoImpl implements BackLoginDao {
	
	private BaseDao baseDao;
	
	/**
	 * Created by hc on 2016/7/16 
	 * 后台登录验证方法
	 * 验证成功:true
	 * 验证失败:false
	 */
	@Override
	public boolean checkLogin(String userName, String passWord) {
		String hql="select model.userName,model.passWord from User as model where userName=? and passWord=?";
		Object[] value={userName,passWord};
		ArrayList list=(ArrayList)baseDao.findByHql(hql, value);
		if(list.size()==1){
			try {
				System.out.println(list.get(0));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}else {
			return false;
		}
	}

	public BaseDao getBaseDao() {
		return baseDao;
	}
	
	@Resource(name="baseDao")
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

}
