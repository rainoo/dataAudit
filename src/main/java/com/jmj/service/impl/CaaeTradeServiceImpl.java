package com.jmj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.dao.CaaeTradeMapper;
import com.jmj.entity.CaaeTrade;
import com.jmj.entity.CaaeTradeExample;
import com.jmj.service.ICaaeTradeService;

@Service("caaeTradeService")
@Transactional
public class CaaeTradeServiceImpl implements ICaaeTradeService {
	
	@Resource
	private CaaeTradeMapper caaeTradeMapper;

	@Override
	public int countByExample(CaaeTradeExample example) {
		return caaeTradeMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CaaeTradeExample example) {
		return caaeTradeMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String tradeId) {
		return caaeTradeMapper.deleteByPrimaryKey(tradeId);
	}

	@Override
	public int insert(CaaeTrade record) {
		return caaeTradeMapper.insert(record);
	}

	@Override
	public int insertSelective(CaaeTrade record) {
		return caaeTradeMapper.insertSelective(record);
	}

	@Override
	public List<CaaeTrade> selectByExample(CaaeTradeExample example) {
		return caaeTradeMapper.selectByExample(example);
	}

	@Override
	public CaaeTrade selectByPrimaryKey(String tradeId) {
		return caaeTradeMapper.selectByPrimaryKey(tradeId);
	}

	@Override
	public int updateByExampleSelective(CaaeTrade record,
			CaaeTradeExample example) {
		return caaeTradeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CaaeTrade record, CaaeTradeExample example) {
		return caaeTradeMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CaaeTrade record) {
		return caaeTradeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CaaeTrade record) {
		return caaeTradeMapper.updateByPrimaryKey(record);
	}
	
}
