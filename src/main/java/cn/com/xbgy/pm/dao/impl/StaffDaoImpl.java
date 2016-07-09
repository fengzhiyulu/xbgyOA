package cn.com.xbgy.pm.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.com.xbgy.core.dao.impl.BaseDaoImpl;
import cn.com.xbgy.pm.bean.Depart;
import cn.com.xbgy.pm.bean.Staff;
import cn.com.xbgy.pm.bean.User;
import cn.com.xbgy.pm.dao.StaffDao;


@Repository("staffDao")
public class StaffDaoImpl extends BaseDaoImpl<Staff> implements StaffDao {


}
