package com.jmj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.dao.CaaeAssessMapper;
import com.jmj.entity.CaaeAssess;
import com.jmj.entity.CaaeAssessExample;
import com.jmj.service.ICaaeAssessService;

@Service("caaeAssessService")
@Transactional
public class CaaeAssessServiceImpl implements ICaaeAssessService {
	
	@Resource
	private CaaeAssessMapper caaeAssessMapper;

	@Override
	public int countByExample(CaaeAssessExample example) {
		return caaeAssessMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CaaeAssessExample example) {
		return caaeAssessMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String assessId) {
		return caaeAssessMapper.deleteByPrimaryKey(assessId);
	}

	@Override
	public int insert(CaaeAssess record) {
		return caaeAssessMapper.insert(record);
	}

	@Override
	public int insertSelective(CaaeAssess record) {
		return caaeAssessMapper.insertSelective(record);
	}

	@Override
	public List<CaaeAssess> selectByExample(CaaeAssessExample example) {
		return caaeAssessMapper.selectByExample(example);
	}

	@Override
	public CaaeAssess selectByPrimaryKey(String assessId) {
		return caaeAssessMapper.selectByPrimaryKey(assessId);
	}

	@Override
	public int updateByExampleSelective(CaaeAssess record,
			CaaeAssessExample example) {
		return caaeAssessMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CaaeAssess record, CaaeAssessExample example) {
		return caaeAssessMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CaaeAssess record) {
		return caaeAssessMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CaaeAssess record) {
		return caaeAssessMapper.updateByPrimaryKey(record);
	}
	
}
