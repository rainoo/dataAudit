package com.jmj.dao2;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity2.CaaeAssess2;
import com.jmj.entity2.CaaeAssess2Example;

public interface CaaeAssess2Mapper {
    int countByExample(CaaeAssess2Example example);

    int deleteByExample(CaaeAssess2Example example);

    int deleteByPrimaryKey(String assessId);

    int insert(CaaeAssess2 record);

    int insertSelective(CaaeAssess2 record);

    List<CaaeAssess2> selectByExample(CaaeAssess2Example example);

    CaaeAssess2 selectByPrimaryKey(String assessId);

    int updateByExampleSelective(@Param("record") CaaeAssess2 record, @Param("example") CaaeAssess2Example example);

    int updateByExample(@Param("record") CaaeAssess2 record, @Param("example") CaaeAssess2Example example);

    int updateByPrimaryKeySelective(CaaeAssess2 record);

    int updateByPrimaryKey(CaaeAssess2 record);
}