package com.jmj.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity.GqCaaeProject;
import com.jmj.entity.GqCaaeProjectExample;

public interface IGqCaaeProjectService {
	int countByExample(GqCaaeProjectExample example);

    int deleteByExample(GqCaaeProjectExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(GqCaaeProject record);

    int insertSelective(GqCaaeProject record);

    List<GqCaaeProject> selectByExample(GqCaaeProjectExample example);

    GqCaaeProject selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") GqCaaeProject record, @Param("example") GqCaaeProjectExample example);

    int updateByExample(@Param("record") GqCaaeProject record, @Param("example") GqCaaeProjectExample example);

    int updateByPrimaryKeySelective(GqCaaeProject record);

    int updateByPrimaryKey(GqCaaeProject record);
}
