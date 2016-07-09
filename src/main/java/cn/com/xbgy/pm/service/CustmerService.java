package cn.com.xbgy.pm.service;

import cn.com.xbgy.core.service.BaseService;
import cn.com.xbgy.core.util.PageResult;
import cn.com.xbgy.core.util.QueryHelper;
import cn.com.xbgy.pm.bean.Custmer;
import cn.com.xbgy.pm.bean.Depart;

public interface CustmerService extends BaseService<Custmer>{
	public PageResult findObject(int pageNo,int pageSize,QueryHelper qh);
}
