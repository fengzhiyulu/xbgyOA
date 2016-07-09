package cn.com.xbgy.core.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import cn.com.xbgy.core.dao.BaseDao;
import cn.com.xbgy.core.service.BaseService;
import cn.com.xbgy.pm.dao.CustmerDao;
import cn.com.xbgy.pm.dao.DepartDao;
import cn.com.xbgy.pm.dao.StaffDao;
import cn.com.xbgy.pm.dao.UserDao;
import cn.com.xbgy.sale.dao.GoodsDao;
import cn.com.xbgy.sale.dao.MarketOrderDao;

public class BaseServiceImpl<T> implements BaseService<T>{
	
	private BaseDao<T> baseDao;
	
	@Resource
	protected UserDao userDao;
	
	@Resource
	protected StaffDao staffDao;

	@Resource
	protected DepartDao departDao;
	
	@Resource
	protected GoodsDao goodsDao;
	
	@Resource
	protected CustmerDao custmerDao;
	
	@Resource
	protected MarketOrderDao marketOrderDao;
	@Override
	public void save(T t) {
		baseDao.save(t);
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		baseDao.update(t);
	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub
		baseDao.delete(t);
	}

	@Override
	public T find(Integer id) {
		// TODO Auto-generated method stub
		return baseDao.find(id);
	}

	@Override
	public T get(Integer id) {
		// TODO Auto-generated method stub
		return baseDao.get(id);
	}
	
	@Override
	public List<T> findAll() {
		return baseDao.findAll();
	}
	
	public BaseServiceImpl(){
		
	}
	
	@PostConstruct
	public void init(){
		 Class clazz = (Class)((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		 String clazzName = clazz.getSimpleName();
		 String fieldName = clazzName.substring(0, 1).toLowerCase()+clazzName.substring(1) + "Dao";
		 try {
			Field childFiled = this.getClass().getSuperclass().getDeclaredField(fieldName);
			Field baseFiled = this.getClass().getSuperclass().getDeclaredField("baseDao");
			baseFiled.set(this, childFiled.get(this));
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
