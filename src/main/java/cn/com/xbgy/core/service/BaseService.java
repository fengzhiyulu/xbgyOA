package cn.com.xbgy.core.service;

import java.io.Serializable;
import java.util.List;


public interface BaseService<T> {

	public void save(T t);
	
	public void update(T t);
	
	public void delete(T t);
	
	public T find(Integer id);
	
	public T get(Integer id);
	
	public List<T> findAll();

}
