package com.jmj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.dao.CaaeAddPubMapper;
import com.jmj.entity.CaaeAddPub;
import com.jmj.entity.CaaeAddPubExample;
import com.jmj.service.ICaaeAddPubService;
@Service("caaeAddPubService")
@Transactional
public class CaaeAddPubServiceImpl implements ICaaeAddPubService {

	@Resource
	private CaaeAddPubMapper caaeAddPubDao;
	
	@Override
	public int countByExample(CaaeAddPubExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(CaaeAddPubExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(String addPubId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(CaaeAddPub record) {
		return 0;
	}

	@Override
	public int insertSelective(CaaeAddPub record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CaaeAddPub> selectByExample(CaaeAddPubExample example) {
		// TODO Auto-generated method stub
		return caaeAddPubDao.selectByExample(example);
	}

	@Override
	public CaaeAddPub selectByPrimaryKey(String addPubId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(CaaeAddPub record,
			CaaeAddPubExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(CaaeAddPub record, CaaeAddPubExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(CaaeAddPub record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(CaaeAddPub record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
