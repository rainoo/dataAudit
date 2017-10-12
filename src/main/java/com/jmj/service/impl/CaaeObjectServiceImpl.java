package com.jmj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.dao.CaaeObjectMapper;
import com.jmj.entity.CaaeObject;
import com.jmj.entity.CaaeObjectExample;
import com.jmj.service.ICaaeObjectService;

@Service("caaeObjectService")
@Transactional
public class CaaeObjectServiceImpl implements ICaaeObjectService {
	
	@Resource
	private CaaeObjectMapper caaeObjectMapper;

	@Override
	public int countByExample(CaaeObjectExample example) {
		return caaeObjectMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CaaeObjectExample example) {
		return caaeObjectMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String objectId) {
		return caaeObjectMapper.deleteByPrimaryKey(objectId);
	}

	@Override
	public int insert(CaaeObject record) {
		return caaeObjectMapper.insert(record);
	}

	@Override
	public int insertSelective(CaaeObject record) {
		return caaeObjectMapper.insertSelective(record);
	}

	@Override
	public List<CaaeObject> selectByExample(CaaeObjectExample example) {
		return caaeObjectMapper.selectByExample(example);
	}

	@Override
	public CaaeObject selectByPrimaryKey(String objectId) {
		return caaeObjectMapper.selectByPrimaryKey(objectId);
	}

	@Override
	public int updateByExampleSelective(CaaeObject record,
			CaaeObjectExample example) {
		return caaeObjectMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CaaeObject record, CaaeObjectExample example) {
		return caaeObjectMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CaaeObject record) {
		return caaeObjectMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CaaeObject record) {
		return caaeObjectMapper.updateByPrimaryKey(record);
	}
	
}
