package com.jmj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.dao.CaaeSellerMapper;
import com.jmj.entity.CaaeSeller;
import com.jmj.entity.CaaeSellerExample;
import com.jmj.service.ICaaeSellerService;

@Service("caaeSellerService")
@Transactional
public class CaaeSellerServiceImpl implements ICaaeSellerService {
	
	@Resource
	private CaaeSellerMapper caaeSellerMapper;

	@Override
	public int countByExample(CaaeSellerExample example) {
		return caaeSellerMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CaaeSellerExample example) {
		return caaeSellerMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String sellerId) {
		return caaeSellerMapper.deleteByPrimaryKey(sellerId);
	}

	@Override
	public int insert(CaaeSeller record) {
		return caaeSellerMapper.insert(record);
	}

	@Override
	public int insertSelective(CaaeSeller record) {
		return caaeSellerMapper.insertSelective(record);
	}

	@Override
	public List<CaaeSeller> selectByExample(CaaeSellerExample example) {
		return caaeSellerMapper.selectByExample(example);
	}

	@Override
	public CaaeSeller selectByPrimaryKey(String sellerId) {
		return caaeSellerMapper.selectByPrimaryKey(sellerId);
	}

	@Override
	public int updateByExampleSelective(CaaeSeller record,
			CaaeSellerExample example) {
		return caaeSellerMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CaaeSeller record, CaaeSellerExample example) {
		return caaeSellerMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CaaeSeller record) {
		return caaeSellerMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CaaeSeller record) {
		return caaeSellerMapper.updateByPrimaryKey(record);
	}
	
}
