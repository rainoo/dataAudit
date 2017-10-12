package com.jmj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.dao.CaaeFinanceMapper;
import com.jmj.entity.CaaeFinance;
import com.jmj.entity.CaaeFinanceExample;
import com.jmj.service.ICaaeFinanceService;

@Service("caaeFinanceService")
@Transactional
public class CaaeFinanceServiceImpl implements ICaaeFinanceService {
	
	@Resource
	private CaaeFinanceMapper caaeFinanceMapper;

	@Override
	public int countByExample(CaaeFinanceExample example) {
		return caaeFinanceMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CaaeFinanceExample example) {
		return caaeFinanceMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String financeId) {
		return caaeFinanceMapper.deleteByPrimaryKey(financeId);
	}

	@Override
	public int insert(CaaeFinance record) {
		return caaeFinanceMapper.insert(record);
	}

	@Override
	public int insertSelective(CaaeFinance record) {
		return caaeFinanceMapper.insertSelective(record);
	}

	@Override
	public List<CaaeFinance> selectByExample(CaaeFinanceExample example) {
		return caaeFinanceMapper.selectByExample(example);
	}

	@Override
	public CaaeFinance selectByPrimaryKey(String financeId) {
		return caaeFinanceMapper.selectByPrimaryKey(financeId);
	}

	@Override
	public int updateByExampleSelective(CaaeFinance record,
			CaaeFinanceExample example) {
		return caaeFinanceMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CaaeFinance record, CaaeFinanceExample example) {
		return caaeFinanceMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CaaeFinance record) {
		return caaeFinanceMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CaaeFinance record) {
		return caaeFinanceMapper.updateByPrimaryKey(record);
	}
	
}
