package cn.com.xbgy.pm.action;

import com.opensymphony.xwork2.ModelDriven;

import cn.com.xbgy.core.action.BaseAcion;
import cn.com.xbgy.pm.bean.User;

/**
 * 
 * @author Administrator
 * 
 */
public interface UserAction extends BaseAcion<User>,ModelDriven<User>{

	// 登陆
	public String login() throws Exception;

	// 注销
	public String logout() throws Exception;

	// 注册
	public String register() throws Exception;

	public String changePWD() throws Exception;

	// 授权
	public String grant() throws Exception;
}
