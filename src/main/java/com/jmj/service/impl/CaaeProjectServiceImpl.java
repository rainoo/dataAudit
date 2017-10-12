package com.jmj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.dao.CaaeProjectMapper;
import com.jmj.entity.CaaeProject;
import com.jmj.entity.CaaeProjectExample;
import com.jmj.service.ICaaeProjectService;

@Service("caaeProjectService")
@Transactional
public class CaaeProjectServiceImpl implements ICaaeProjectService {

	@Resource
	private CaaeProjectMapper projectDao;
	
	@Override
	public int countByExample(CaaeProjectExample example) {
		return projectDao.countByExample(example);
	}

	@Override
	public int deleteByExample(CaaeProjectExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(String proTransId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(CaaeProject record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(CaaeProject record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CaaeProject> selectByExample(CaaeProjectExample example) {
		return projectDao.selectByExample(example);
	}

	@Override
	public CaaeProject selectByPrimaryKey(String proTransId) {
		return projectDao.selectByPrimaryKey(proTransId);
	}

	@Override
	public int updateByExampleSelective(CaaeProject record,
			CaaeProjectExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(CaaeProject record, CaaeProjectExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(CaaeProject record) {
		return projectDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CaaeProject record) {
		return projectDao.updateByPrimaryKey(record);
	}

	@Override
	public List<CaaeProject> selectByPage(CaaeProjectExample example) {
		return projectDao.selectByPage(example);
	}

	public List<CaaeProject> selectByTrad() {
		return projectDao.selectByTrad();
	}

	public int countByExampleById(CaaeProjectExample example) {
		return projectDao.countByExampleById(example);
	}

}
