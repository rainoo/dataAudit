package com.jmj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.dao.ZzCaaeProjectMapper;
import com.jmj.entity.ZzCaaeProject;
import com.jmj.entity.ZzCaaeProjectExample;
import com.jmj.service.IZzCaaeProjectService;

@Service("zzCaaeProjectService")
@Transactional
public class ZzCaaeProjectServiceImpl implements IZzCaaeProjectService {

	@Resource
	private ZzCaaeProjectMapper zzCaaeProjectDao;
	
	@Override
	public int countByExample(ZzCaaeProjectExample example) {
		return zzCaaeProjectDao.countByExample(example);
	}

	@Override
	public int deleteByExample(ZzCaaeProjectExample example) {
		return zzCaaeProjectDao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String uuid) {
		return zzCaaeProjectDao.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insert(ZzCaaeProject record) {
		return zzCaaeProjectDao.insert(record);
	}

	@Override
	public int insertSelective(ZzCaaeProject record) {
		return zzCaaeProjectDao.insertSelective(record);
	}

	@Override
	public List<ZzCaaeProject> selectByExample(ZzCaaeProjectExample example) {
		return zzCaaeProjectDao.selectByExample(example);
	}

	@Override
	public ZzCaaeProject selectByPrimaryKey(String uuid) {
		return zzCaaeProjectDao.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByExampleSelective(ZzCaaeProject record,
			ZzCaaeProjectExample example) {
		return zzCaaeProjectDao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(ZzCaaeProject record,
			ZzCaaeProjectExample example) {
		return zzCaaeProjectDao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(ZzCaaeProject record) {
		return zzCaaeProjectDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ZzCaaeProject record) {
		return zzCaaeProjectDao.updateByPrimaryKey(record);
	}

}
