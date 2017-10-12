package com.jmj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.dao.GqCaaeProjectMapper;
import com.jmj.entity.GqCaaeProject;
import com.jmj.entity.GqCaaeProjectExample;
import com.jmj.service.IGqCaaeProjectService;

@Service("gqCaaeProjectService")
@Transactional
public class GqCaaeProjectServiceImpl implements IGqCaaeProjectService {
	
	@Resource
	private GqCaaeProjectMapper gqCaaeProjectMapper;

	@Override
	public int countByExample(GqCaaeProjectExample example) {
		return gqCaaeProjectMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(GqCaaeProjectExample example) {
		return gqCaaeProjectMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String uuid) {
		return gqCaaeProjectMapper.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insert(GqCaaeProject record) {
		return gqCaaeProjectMapper.insert(record);
	}

	@Override
	public int insertSelective(GqCaaeProject record) {
		return gqCaaeProjectMapper.insertSelective(record);
	}

	@Override
	public List<GqCaaeProject> selectByExample(GqCaaeProjectExample example) {
		return gqCaaeProjectMapper.selectByExample(example);
	}

	@Override
	public GqCaaeProject selectByPrimaryKey(String uuid) {
		return gqCaaeProjectMapper.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByExampleSelective(GqCaaeProject record,
			GqCaaeProjectExample example) {
		return gqCaaeProjectMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(GqCaaeProject record,
			GqCaaeProjectExample example) {
		return gqCaaeProjectMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(GqCaaeProject record) {
		return gqCaaeProjectMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(GqCaaeProject record) {
		return gqCaaeProjectMapper.updateByPrimaryKey(record);
	}
	
}
