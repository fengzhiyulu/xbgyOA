package cn.com.xbgy.pm.dao.impl;

import org.springframework.stereotype.Repository;

import cn.com.xbgy.core.dao.impl.BaseDaoImpl;
import cn.com.xbgy.pm.bean.Custmer;
import cn.com.xbgy.pm.dao.CustmerDao;


@Repository("custmerDao")
public class CustmerDaoImpl extends BaseDaoImpl<Custmer> implements CustmerDao {


}
