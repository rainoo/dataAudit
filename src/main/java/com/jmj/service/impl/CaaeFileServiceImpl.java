package com.jmj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.dao.CaaeFileMapper;
import com.jmj.entity.CaaeFile;
import com.jmj.entity.CaaeFileExample;
import com.jmj.service.ICaaeFileService;
@Service("caaeFileService")
@Transactional
public class CaaeFileServiceImpl implements ICaaeFileService {
	
	@Resource
	private CaaeFileMapper caaeFileMapper;

	@Override
	public int countByExample(CaaeFileExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(CaaeFileExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(String fileId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(CaaeFile record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(CaaeFile record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CaaeFile> selectByExample(CaaeFileExample example) {
		return caaeFileMapper.selectByExample(example);
	}

	@Override
	public CaaeFile selectByPrimaryKey(String fileId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(CaaeFile record, CaaeFileExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(CaaeFile record, CaaeFileExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(CaaeFile record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(CaaeFile record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
