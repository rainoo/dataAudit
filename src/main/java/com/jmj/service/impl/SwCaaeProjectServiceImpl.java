package com.jmj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.dao.SwCaaeProjectMapper;
import com.jmj.entity.SwCaaeProject;
import com.jmj.entity.SwCaaeProjectExample;
import com.jmj.service.ISwCaaeProjectService;

@Service("swCaaeProjectService")
@Transactional
public class SwCaaeProjectServiceImpl implements ISwCaaeProjectService {
	
	@Resource
	private SwCaaeProjectMapper swCaaeProjectMapper;

	@Override
	public int countByExample(SwCaaeProjectExample example) {
		return swCaaeProjectMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(SwCaaeProjectExample example) {
		return swCaaeProjectMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String uuid) {
		return swCaaeProjectMapper.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insert(SwCaaeProject record) {
		return swCaaeProjectMapper.insert(record);
	}

	@Override
	public int insertSelective(SwCaaeProject record) {
		return swCaaeProjectMapper.insertSelective(record);
	}

	@Override
	public List<SwCaaeProject> selectByExample(SwCaaeProjectExample example) {
		return swCaaeProjectMapper.selectByExample(example);
	}

	@Override
	public SwCaaeProject selectByPrimaryKey(String uuid) {
		return swCaaeProjectMapper.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByExampleSelective(SwCaaeProject record,
			SwCaaeProjectExample example) {
		return swCaaeProjectMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(SwCaaeProject record,
			SwCaaeProjectExample example) {
		return swCaaeProjectMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(SwCaaeProject record) {
		return swCaaeProjectMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SwCaaeProject record) {
		return swCaaeProjectMapper.updateByPrimaryKey(record);
	}
	
}
