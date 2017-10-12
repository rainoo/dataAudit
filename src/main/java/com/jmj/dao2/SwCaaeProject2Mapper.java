package com.jmj.dao2;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity2.SwCaaeProject2;
import com.jmj.entity2.SwCaaeProject2Example;

public interface SwCaaeProject2Mapper {
    int countByExample(SwCaaeProject2Example example);

    int deleteByExample(SwCaaeProject2Example example);

    int deleteByPrimaryKey(String uuid);

    int insert(SwCaaeProject2 record);

    int insertSelective(SwCaaeProject2 record);

    List<SwCaaeProject2> selectByExample(SwCaaeProject2Example example);

    SwCaaeProject2 selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") SwCaaeProject2 record, @Param("example") SwCaaeProject2Example example);

    int updateByExample(@Param("record") SwCaaeProject2 record, @Param("example") SwCaaeProject2Example example);

    int updateByPrimaryKeySelective(SwCaaeProject2 record);

    int updateByPrimaryKey(SwCaaeProject2 record);
}