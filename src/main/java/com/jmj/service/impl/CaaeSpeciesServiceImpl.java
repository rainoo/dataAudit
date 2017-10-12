package com.jmj.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmj.entity.CaaeSpecies;
import com.jmj.entity.CaaeSpeciesExample;
import com.jmj.service.ICaaeSpeciesService;
@Service("caaeSpeciesService")
@Transactional
public class CaaeSpeciesServiceImpl implements ICaaeSpeciesService {

	@Override
	public int countByExample(CaaeSpeciesExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(CaaeSpeciesExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(String speciesId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(CaaeSpecies record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(CaaeSpecies record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CaaeSpecies> selectByExample(CaaeSpeciesExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CaaeSpecies selectByPrimaryKey(String speciesId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(CaaeSpecies record,
			CaaeSpeciesExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(CaaeSpecies record, CaaeSpeciesExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(CaaeSpecies record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(CaaeSpecies record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
