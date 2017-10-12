package com.jmj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.dao.CaaeNegoinfoMapper;
import com.jmj.entity.CaaeNegoinfo;
import com.jmj.entity.CaaeNegoinfoExample;
import com.jmj.service.ICaaeNegoinfoService;
@Service("caaeNegoinfoService")
@Transactional
public class CaaeNegoinfoServiceImpl implements ICaaeNegoinfoService {

	@Resource
	private CaaeNegoinfoMapper caaeNegoinfoMapper;
	
	@Override
	public int countByExample(CaaeNegoinfoExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(CaaeNegoinfoExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(String negoInfoId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(CaaeNegoinfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(CaaeNegoinfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CaaeNegoinfo> selectByExample(CaaeNegoinfoExample example) {
		// TODO Auto-generated method stub
		return caaeNegoinfoMapper.selectByExample(example);
	}

	@Override
	public CaaeNegoinfo selectByPrimaryKey(String negoInfoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(CaaeNegoinfo record,
			CaaeNegoinfoExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(CaaeNegoinfo record, CaaeNegoinfoExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(CaaeNegoinfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(CaaeNegoinfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
