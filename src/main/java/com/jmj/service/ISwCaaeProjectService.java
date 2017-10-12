package com.jmj.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity.SwCaaeProject;
import com.jmj.entity.SwCaaeProjectExample;

public interface ISwCaaeProjectService {
	int countByExample(SwCaaeProjectExample example);

    int deleteByExample(SwCaaeProjectExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(SwCaaeProject record);

    int insertSelective(SwCaaeProject record);

    List<SwCaaeProject> selectByExample(SwCaaeProjectExample example);

    SwCaaeProject selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") SwCaaeProject record, @Param("example") SwCaaeProjectExample example);

    int updateByExample(@Param("record") SwCaaeProject record, @Param("example") SwCaaeProjectExample example);

    int updateByPrimaryKeySelective(SwCaaeProject record);

    int updateByPrimaryKey(SwCaaeProject record);
}
