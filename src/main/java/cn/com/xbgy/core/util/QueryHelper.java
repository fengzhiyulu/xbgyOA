package cn.com.xbgy.core.util;

import java.util.ArrayList;
import java.util.List;

public class QueryHelper {
	
	//from 子句
	private String fromClause = "";
	//where 子句
	private String whereClause = "";
	//order by 子句
	private String orderByClause = "";
	
	//order by 升序
	public static String ORDER_BY_ASC = "ASC";
	//order by 降序
	public static String ORDER_BY_DESC = "DESC";
	
	//查询语句中?对应的参数集合
	private List<Object> parameters;
	
	/**
	 * 组装from 子句
	 * @param clazz 实体类
	 * @param alias 别名
	 */
	public QueryHelper(Class clazz, String alias){
		fromClause = "FROM " + clazz.getSimpleName() + " " + alias;
	}
	
	/**
	 * 组装where子句
	 * @param condiction 条件语句
	 * @param objects 条件语句对应的?对应的值集合
	 */
	public QueryHelper addCondiction(String condiction, Object...objects ){
		if (whereClause.length() > 0) {//如果有添加的情况
			whereClause += " AND " + condiction;
		} else {//新添加的时候
			whereClause += " WHERE " + condiction;
		}
		if(objects != null){
			if (parameters == null) {//初始化参数值集合
				parameters = new ArrayList<Object>();
			}
			for(Object obj: objects){
				parameters.add(obj);
			}
		}
		return this;
	}
	
	/**
	 * 组装 order by 子句
	 * @param property 要排序的属性
	 * @param order 升序(asc) 或 降序(desc)
	 */
	public QueryHelper addOrderByProperty(String property, String order){
		if (orderByClause.length() > 0) {//如果有添加添加的情况
			orderByClause += " , " + property + " " + order;
		} else {//新添加的时候
			orderByClause += " ORDER BY " + property + " " + order;
		}
		return this;
	}
	
	//返回查询语句
	public String getQueryListHql(){
		return fromClause + whereClause + orderByClause;
	}

	//返回查询记录总数的语句
	public String getCountHql(){
		return "SELECT COUNT(*) " + fromClause + whereClause;
	}
	
	public List<Object> getParameters() {
		return parameters;
	}

	public void setParameters(List<Object> parameters) {
		this.parameters = parameters;
	}

}
