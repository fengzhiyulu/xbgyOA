package cn.com.xbgy.core.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cn.com.xbgy.core.dao.BaseDao;
import cn.com.xbgy.core.util.PageResult;
import cn.com.xbgy.core.util.QueryHelper;

public class BaseDaoImpl<T> implements BaseDao<T>{
	
	public BaseDaoImpl(){
		 this.clazz = (Class)((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	

	@Override
	public void save(T t) {
		getSession().save(t);
	}

	@Override
	public void update(T t) {
		getSession().update(t);
	}

	@Override
	public void delete(T t) {
		getSession().delete(t);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T find(Integer id) {
		Object obj = getSession().load(clazz, id);
		return (T)obj;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		Query query = getSession().createQuery("From "+clazz.getSimpleName());
		return query.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(Integer id) {
		Object obj = getSession().get(clazz, id);
		return (T)obj;
	}
	
	public List<T> findObjects(QueryHelper qh){
		Query query = getSession().createQuery(qh.getQueryListHql());
		List<Object> parameters = qh.getParameters();
		if(parameters!=null){
			for (int i = 0; i < parameters.size(); i++) {
				query.setParameter(i, parameters.get(i));
			}
		}
		List list = query.list();
		return list;
	}
	
	public PageResult findObject(int pageNo,int pageSize,QueryHelper qh){
		Query query = getSession().createQuery(qh.getQueryListHql());
		List<Object> parameters = qh.getParameters();
		if(parameters!=null){
			for (int i = 0; i < parameters.size(); i++) {
				query.setParameter(i, parameters.get(i));
			}
		}
		if(pageNo==0) pageNo=1;
		query.setFirstResult((pageNo-1)*pageSize);
		query.setMaxResults(pageSize);
		
		List list = query.list();
		Query countQuery = getSession().createQuery(qh.getCountHql());
		if(parameters!=null){
			for (int i = 0; i < parameters.size(); i++) {
				countQuery.setParameter(i, parameters.get(i));
			}
		}
		Long totalCount = (Long)countQuery.uniqueResult();
		
		return new PageResult(pageNo,pageSize,totalCount,list);
	}

	@Resource
	protected SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	private Class clazz;


}
