package com.jmj.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.entity.CaaeOrg;
import com.jmj.entity.CaaeOrgExample;
import com.jmj.service.ICaaeOrgService;
@Service("caaeOrgService")
@Transactional
public class CaaeOrgServiceImpl implements ICaaeOrgService {

	@Override
	public int countByExample(CaaeOrgExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(CaaeOrgExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(String orgId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(CaaeOrg record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(CaaeOrg record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CaaeOrg> selectByExample(CaaeOrgExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CaaeOrg selectByPrimaryKey(String orgId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(CaaeOrg record, CaaeOrgExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(CaaeOrg record, CaaeOrgExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(CaaeOrg record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(CaaeOrg record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
