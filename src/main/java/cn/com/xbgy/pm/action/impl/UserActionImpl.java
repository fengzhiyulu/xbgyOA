package cn.com.xbgy.pm.action.impl;

import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.com.xbgy.core.action.impl.BaseActionImpl;
import cn.com.xbgy.pm.action.UserAction;
import cn.com.xbgy.pm.bean.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

@Controller("userAction")
@Scope("prototype")
// 完成注册 修改密码 登陆
public class UserActionImpl extends BaseActionImpl<User> implements UserAction {
	public UserActionImpl() {
		System.out.println("创建成功 UserAction");
	}

	public String loginPage() {
		return "login";
	}

	public String registerPage() {
		return "register";
	}

	public String changePwdPage() {
		return "changePWD";
	}

	public String login() throws Exception {

		String result = "error";
		userService.login(user.getUsername(), user.getPassword());
		if (user != null) {
			Map<String, Object> session = ActionContext.getContext()
					.getSession();
			session.put("userInfo", user);
			result = "index";
		}
		return result;
	}

	public String logout() throws Exception {
		Map<String, Object> session = getActionContext().getSession();
		session.remove("userInfo");
		return "login";
	}

	@Override
	public String register() throws Exception {
		// TODO Auto-generated method stub
		String result = "register";
		boolean b = userService.register(user);
		if (b)
			result = "index";
		return result;
	}

	@Override
	public String changePWD() throws Exception {
		// TODO Auto-generated method stuba
		userService.updatePWD(user.getUsername(), user.getPassword(), this.newPass);
		return "index";
	}

	@Override
	public String grant() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public User user;
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public User getModel() {
		if (user == null)
			user = new User();
		return user;
	}
	
	public String newPass;
	
	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}

}
