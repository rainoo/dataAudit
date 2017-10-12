package com.jmj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.dao.CaaeAppraisalMapper;
import com.jmj.dao2.CaaeAppraisal2Mapper;
import com.jmj.entity.CaaeAppraisal;
import com.jmj.entity.CaaeAppraisalExample;
import com.jmj.service.ICaaeAppraisalService;
@Service("caaeAppraisalService")
@Transactional
public class CaaeAppraisalServiceImpl implements ICaaeAppraisalService {

	@Resource
	private CaaeAppraisalMapper caaeAppraisaDao;
	
	@Override
	public int countByExample(CaaeAppraisalExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(CaaeAppraisalExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(String appraisalId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(CaaeAppraisal record) {
		return caaeAppraisaDao.insert(record);
	}

	@Override
	public int insertSelective(CaaeAppraisal record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CaaeAppraisal> selectByExample(CaaeAppraisalExample example) {
		return caaeAppraisaDao.selectByExample(example);
	}

	@Override
	public CaaeAppraisal selectByPrimaryKey(String appraisalId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(CaaeAppraisal record,
			CaaeAppraisalExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(CaaeAppraisal record,
			CaaeAppraisalExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(CaaeAppraisal record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(CaaeAppraisal record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
