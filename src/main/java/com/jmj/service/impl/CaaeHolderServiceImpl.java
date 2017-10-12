package com.jmj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.dao.CaaeHolderMapper;
import com.jmj.entity.CaaeHolder;
import com.jmj.entity.CaaeHolderExample;
import com.jmj.service.ICaaeHolderService;

@Service("caaeHolderService")
@Transactional
public class CaaeHolderServiceImpl implements ICaaeHolderService {
	
	@Resource
	private CaaeHolderMapper caaeHolderMapper;

	@Override
	public int countByExample(CaaeHolderExample example) {
		return caaeHolderMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CaaeHolderExample example) {
		return caaeHolderMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String holderId) {
		return caaeHolderMapper.deleteByPrimaryKey(holderId);
	}

	@Override
	public int insert(CaaeHolder record) {
		return caaeHolderMapper.insert(record);
	}

	@Override
	public int insertSelective(CaaeHolder record) {
		return caaeHolderMapper.insertSelective(record);
	}

	@Override
	public List<CaaeHolder> selectByExample(CaaeHolderExample example) {
		return caaeHolderMapper.selectByExample(example);
	}

	@Override
	public CaaeHolder selectByPrimaryKey(String holderId) {
		return caaeHolderMapper.selectByPrimaryKey(holderId);
	}

	@Override
	public int updateByExampleSelective(CaaeHolder record,
			CaaeHolderExample example) {
		return caaeHolderMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CaaeHolder record, CaaeHolderExample example) {
		return caaeHolderMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CaaeHolder record) {
		return caaeHolderMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CaaeHolder record) {
		return caaeHolderMapper.updateByPrimaryKey(record);
	}
	
}
