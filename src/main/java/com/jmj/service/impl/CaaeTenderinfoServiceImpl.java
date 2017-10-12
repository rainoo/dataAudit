package com.jmj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.dao.CaaeTenderinfoMapper;
import com.jmj.entity.CaaeTenderinfo;
import com.jmj.entity.CaaeTenderinfoExample;
import com.jmj.service.ICaaeTenderinfoService;

@Service("caaeTenderinfoService")
@Transactional
public class CaaeTenderinfoServiceImpl implements ICaaeTenderinfoService {
	
	@Resource
	private CaaeTenderinfoMapper caaeTenderinfoMapper;

	@Override
	public int countByExample(CaaeTenderinfoExample example) {
		return caaeTenderinfoMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CaaeTenderinfoExample example) {
		return caaeTenderinfoMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String tenderInfoId) {
		return caaeTenderinfoMapper.deleteByPrimaryKey(tenderInfoId);
	}

	@Override
	public int insert(CaaeTenderinfo record) {
		return caaeTenderinfoMapper.insert(record);
	}

	@Override
	public int insertSelective(CaaeTenderinfo record) {
		return caaeTenderinfoMapper.insertSelective(record);
	}

	@Override
	public List<CaaeTenderinfo> selectByExample(CaaeTenderinfoExample example) {
		return caaeTenderinfoMapper.selectByExample(example);
	}

	@Override
	public CaaeTenderinfo selectByPrimaryKey(String tenderInfoId) {
		return caaeTenderinfoMapper.selectByPrimaryKey(tenderInfoId);
	}

	@Override
	public int updateByExampleSelective(CaaeTenderinfo record,
			CaaeTenderinfoExample example) {
		return caaeTenderinfoMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CaaeTenderinfo record,
			CaaeTenderinfoExample example) {
		return caaeTenderinfoMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CaaeTenderinfo record) {
		return caaeTenderinfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CaaeTenderinfo record) {
		return caaeTenderinfoMapper.updateByPrimaryKey(record);
	}
	
}
