package com.jmj.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity.CaaeProject;
import com.jmj.entity.CaaeProjectExample;

public interface ICaaeProjectService {
	int countByExample(CaaeProjectExample example);

	int deleteByExample(CaaeProjectExample example);

	int deleteByPrimaryKey(String proTransId);

	int insert(CaaeProject record);

	int insertSelective(CaaeProject record);

	List<CaaeProject> selectByExample(CaaeProjectExample example);

	List<CaaeProject> selectByPage(CaaeProjectExample example);

	CaaeProject selectByPrimaryKey(String proTransId);

	int updateByExampleSelective(@Param("record") CaaeProject record,
			@Param("example") CaaeProjectExample example);

	int updateByExample(@Param("record") CaaeProject record,
			@Param("example") CaaeProjectExample example);

	int updateByPrimaryKeySelective(CaaeProject record);

	int updateByPrimaryKey(CaaeProject record);
}
