package cn.com.xbgy.pm.service.impl;

import org.springframework.stereotype.Service;

import cn.com.xbgy.core.service.impl.BaseServiceImpl;
import cn.com.xbgy.core.util.PageResult;
import cn.com.xbgy.core.util.QueryHelper;
import cn.com.xbgy.pm.bean.Custmer;
import cn.com.xbgy.pm.service.CustmerService;

@Service("custmerService")
public class CustmerServiceImpl extends BaseServiceImpl<Custmer> implements CustmerService{

	@Override
	public PageResult findObject(int pageNo, int pageSize, QueryHelper qh) {
		// TODO Auto-generated method stub
		return custmerDao.findObject(pageNo, pageSize, qh);
	}

}
