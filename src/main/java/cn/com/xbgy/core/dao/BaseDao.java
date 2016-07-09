package cn.com.xbgy.core.dao;

import java.io.Serializable;
import java.util.List;

import cn.com.xbgy.core.util.PageResult;
import cn.com.xbgy.core.util.QueryHelper;

public interface BaseDao<T> {
	
	public void save(T t);
	
	public void update(T t);
	
	public void delete(T t);
	
	public T find(Integer id);
	
	public List<T> findAll();
	
	public T get(Integer id);
	
	public List<T> findObjects(QueryHelper qh);
	
	public PageResult findObject(int pageNo,int pageSize,QueryHelper qh);

}
