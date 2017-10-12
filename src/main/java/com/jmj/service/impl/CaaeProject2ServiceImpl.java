package com.jmj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.dao2.CaaeProject2Mapper;
import com.jmj.entity.CaaeProject2;
import com.jmj.entity.CaaeProject2Example;
import com.jmj.service.ICaaeProject2Service;

@Service("caaeProject2Service")
@Transactional("transactionManager2")
public class CaaeProject2ServiceImpl implements ICaaeProject2Service {

	@Resource
	private CaaeProject2Mapper projectDao;
	@Override
	public int countByExample(CaaeProject2Example example) {
		return projectDao.countByExample(example);
	}

	@Override
	public int deleteByExample(CaaeProject2Example example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(String proTransId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(CaaeProject2 record) {
		return projectDao.insert(record);
	}

	@Override
	public int insertSelective(CaaeProject2 record) {
		return projectDao.insertSelective(record);
	}

	@Override
	public List<CaaeProject2> selectByExample(CaaeProject2Example example) {
		return projectDao.selectByExample(example);
	}

	@Override
	public CaaeProject2 selectByPrimaryKey(String proTransId) {
		return projectDao.selectByPrimaryKey(proTransId);
	}

	@Override
	public int updateByExampleSelective(CaaeProject2 record,
			CaaeProject2Example example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(CaaeProject2 record, CaaeProject2Example example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(CaaeProject2 record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(CaaeProject2 record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
