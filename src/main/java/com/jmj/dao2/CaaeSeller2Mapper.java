package com.jmj.dao2;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity2.CaaeSeller2;
import com.jmj.entity2.CaaeSeller2Example;

public interface CaaeSeller2Mapper {
    int countByExample(CaaeSeller2Example example);

    int deleteByExample(CaaeSeller2Example example);

    int deleteByPrimaryKey(String sellerId);

    int insert(CaaeSeller2 record);

    int insertSelective(CaaeSeller2 record);

    List<CaaeSeller2> selectByExample(CaaeSeller2Example example);

    CaaeSeller2 selectByPrimaryKey(String sellerId);

    int updateByExampleSelective(@Param("record") CaaeSeller2 record, @Param("example") CaaeSeller2Example example);

    int updateByExample(@Param("record") CaaeSeller2 record, @Param("example") CaaeSeller2Example example);

    int updateByPrimaryKeySelective(CaaeSeller2 record);

    int updateByPrimaryKey(CaaeSeller2 record);
}