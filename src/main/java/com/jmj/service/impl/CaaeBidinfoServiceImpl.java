package com.jmj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.dao.CaaeBidinfoMapper;
import com.jmj.entity.CaaeBidinfo;
import com.jmj.entity.CaaeBidinfoExample;
import com.jmj.service.ICaaeBidinfoService;

@Service("caaeBidinfoService")
@Transactional
public class CaaeBidinfoServiceImpl implements ICaaeBidinfoService {
	
	@Resource
	private CaaeBidinfoMapper caaeBidinfoMapper;

	@Override
	public int countByExample(CaaeBidinfoExample example) {
		return caaeBidinfoMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CaaeBidinfoExample example) {
		return caaeBidinfoMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String bidInfoId) {
		return caaeBidinfoMapper.deleteByPrimaryKey(bidInfoId);
	}

	@Override
	public int insert(CaaeBidinfo record) {
		return caaeBidinfoMapper.insert(record);
	}

	@Override
	public int insertSelective(CaaeBidinfo record) {
		return caaeBidinfoMapper.insertSelective(record);
	}

	@Override
	public List<CaaeBidinfo> selectByExample(CaaeBidinfoExample example) {
		return caaeBidinfoMapper.selectByExample(example);
	}

	@Override
	public CaaeBidinfo selectByPrimaryKey(String bidInfoId) {
		return caaeBidinfoMapper.selectByPrimaryKey(bidInfoId);
	}

	@Override
	public int updateByExampleSelective(CaaeBidinfo record,
			CaaeBidinfoExample example) {
		return caaeBidinfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByExample(CaaeBidinfo record, CaaeBidinfoExample example) {
		return caaeBidinfoMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CaaeBidinfo record) {
		return caaeBidinfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CaaeBidinfo record) {
		return caaeBidinfoMapper.updateByPrimaryKey(record);
	}
	
}
