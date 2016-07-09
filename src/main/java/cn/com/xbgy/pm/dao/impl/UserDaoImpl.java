package cn.com.xbgy.pm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import cn.com.xbgy.core.dao.impl.BaseDaoImpl;
import cn.com.xbgy.pm.bean.User;
import cn.com.xbgy.pm.dao.UserDao;


@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
	
	@Override
	public boolean isExsit(String username){
		String hql="FROM User where username=?";
		Query query = getSession().createQuery(hql);
		query.setString(0, username);
		return query.list().size()<=0;
	}

	@Override
	public User login(String username,String password) {
		User user = null;
		String hql = "FROM User where username=? and password = ?";
		Session session = getSession();
		Query query = session.createQuery(hql);
		query.setString(0, username);
		query.setString(1, password);
		List list = query.list();
		if(list.size()>0) {
			user = (User) list.get(0);
		}
		return user;
	}
}
