package com.jmj.dao2;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity2.GqCaaeProject2;
import com.jmj.entity2.GqCaaeProject2Example;

public interface GqCaaeProject2Mapper {
    int countByExample(GqCaaeProject2Example example);

    int deleteByExample(GqCaaeProject2Example example);

    int deleteByPrimaryKey(String uuid);

    int insert(GqCaaeProject2 record);

    int insertSelective(GqCaaeProject2 record);

    List<GqCaaeProject2> selectByExample(GqCaaeProject2Example example);

    GqCaaeProject2 selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") GqCaaeProject2 record, @Param("example") GqCaaeProject2Example example);

    int updateByExample(@Param("record") GqCaaeProject2 record, @Param("example") GqCaaeProject2Example example);

    int updateByPrimaryKeySelective(GqCaaeProject2 record);

    int updateByPrimaryKey(GqCaaeProject2 record);
}