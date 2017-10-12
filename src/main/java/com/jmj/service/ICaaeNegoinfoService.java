package com.jmj.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity.CaaeNegoinfo;
import com.jmj.entity.CaaeNegoinfoExample;

public interface ICaaeNegoinfoService {
	int countByExample(CaaeNegoinfoExample example);

	int deleteByExample(CaaeNegoinfoExample example);

	int deleteByPrimaryKey(String negoInfoId);

	int insert(CaaeNegoinfo record);

	int insertSelective(CaaeNegoinfo record);

	List<CaaeNegoinfo> selectByExample(CaaeNegoinfoExample example);

	CaaeNegoinfo selectByPrimaryKey(String negoInfoId);

	int updateByExampleSelective(@Param("record") CaaeNegoinfo record,
			@Param("example") CaaeNegoinfoExample example);

	int updateByExample(@Param("record") CaaeNegoinfo record,
			@Param("example") CaaeNegoinfoExample example);

	int updateByPrimaryKeySelective(CaaeNegoinfo record);

	int updateByPrimaryKey(CaaeNegoinfo record);
}
