package cn.com.xbgy.pm.service;

import java.io.Serializable;

import cn.com.xbgy.core.service.BaseService;
import cn.com.xbgy.pm.bean.User;

public interface UserService extends BaseService<User>{

	//注册
	public boolean register(User user);
	
	//判断是否存在
	public boolean isExist(String id);
	
	//更改密码
	public void updatePWD(String username,String password , String newPass);
	
	//登陆
	public User login(String username,String password);
	
}
