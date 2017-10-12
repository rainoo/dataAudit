package com.jmj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.dao.CaaeBuyerMapper;
import com.jmj.entity.CaaeBuyer;
import com.jmj.entity.CaaeBuyerExample;
import com.jmj.service.ICaaeBuyerService;

@Service("caaeBuyerService")
@Transactional
public class CaaeBuyerServiceImpl implements ICaaeBuyerService {
	
	@Resource
	private CaaeBuyerMapper caaeBuyerMapper;

	@Override
	public int countByExample(CaaeBuyerExample example) {
		return caaeBuyerMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CaaeBuyerExample example) {
		return caaeBuyerMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String buyerId) {
		return caaeBuyerMapper.deleteByPrimaryKey(buyerId);
	}

	@Override
	public int insert(CaaeBuyer record) {
		return caaeBuyerMapper.insert(record);
	}

	@Override
	public int insertSelective(CaaeBuyer record) {
		return caaeBuyerMapper.insertSelective(record);
	}

	@Override
	public List<CaaeBuyer> selectByExample(CaaeBuyerExample example) {
		return caaeBuyerMapper.selectByExample(example);
	}

	@Override
	public CaaeBuyer selectByPrimaryKey(String buyerId) {
		return caaeBuyerMapper.selectByPrimaryKey(buyerId);
	}

	@Override
	public int updateByExampleSelective(CaaeBuyer record,
			CaaeBuyerExample example) {
		return caaeBuyerMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CaaeBuyer record, CaaeBuyerExample example) {
		return caaeBuyerMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CaaeBuyer record) {
		return caaeBuyerMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CaaeBuyer record) {
		return caaeBuyerMapper.updateByPrimaryKey(record);
	}
	
}
