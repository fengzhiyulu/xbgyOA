package cn.com.xbgy.pm.dao;

import cn.com.xbgy.core.dao.BaseDao;
import cn.com.xbgy.pm.bean.User;


public interface UserDao extends BaseDao<User>{
	public User login(String username,String password);
	
	public boolean isExsit(String username);
	
}
