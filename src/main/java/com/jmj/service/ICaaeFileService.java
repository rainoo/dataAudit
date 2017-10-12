package com.jmj.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity.CaaeFile;
import com.jmj.entity.CaaeFileExample;

public interface ICaaeFileService {
	int countByExample(CaaeFileExample example);

	int deleteByExample(CaaeFileExample example);

	int deleteByPrimaryKey(String fileId);

	int insert(CaaeFile record);

	int insertSelective(CaaeFile record);

	List<CaaeFile> selectByExample(CaaeFileExample example);

	CaaeFile selectByPrimaryKey(String fileId);

	int updateByExampleSelective(@Param("record") CaaeFile record,
			@Param("example") CaaeFileExample example);

	int updateByExample(@Param("record") CaaeFile record,
			@Param("example") CaaeFileExample example);

	int updateByPrimaryKeySelective(CaaeFile record);

	int updateByPrimaryKey(CaaeFile record);
}
