package cn.com.xbgy.pm.service.impl;

import org.springframework.stereotype.Service;

import cn.com.xbgy.core.service.impl.BaseServiceImpl;
import cn.com.xbgy.pm.bean.User;
import cn.com.xbgy.pm.service.UserService;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{

	public boolean register(User user){
		String username = user.getUsername();
		boolean b = isExist(username);
		if(b){
			super.save(user);
		}
		return !b;
	}
	
	public void updatePWD(String username,String password,String newPass){
		User user = this.login(username, password);
		if(user!=null){
			user.setPassword(newPass);
			userDao.update(user);
		}else{
			//TODO 抛出密码错误异常
		}
	}
	
	public boolean isExist(String username){
		return true;
	}

	@Override
	public User login(String username,String password) {
		User user = userDao.login(username, password);
		return user;
	}
}
