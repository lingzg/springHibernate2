package com.lingzg.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lingzg.base.BaseService;
import com.lingzg.base.IBaseDao;
import com.lingzg.common.PageInfo;
import com.lingzg.common.ParamsTable;
import com.lingzg.dao.EmpDao;
import com.lingzg.entity.Emp;

@Service
@Transactional
public class EmpService extends BaseService<Emp, Integer>{

	@Resource
	private EmpDao dao;
	
	@Override
	protected IBaseDao<Emp, Integer> getEntityDao() {
		return dao;
	}
	
	public PageInfo findPage(ParamsTable pt){
		PageInfo page = new PageInfo(pt);
		String hql="from Emp";
		List<Object> params = new ArrayList<Object>();
		dao.findPageByHql(page, hql, params.toArray());
		return page;
	}
}
