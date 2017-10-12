package com.jmj.dao2;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity2.CaaeBuyer2;
import com.jmj.entity2.CaaeBuyer2Example;

public interface CaaeBuyer2Mapper {
    int countByExample(CaaeBuyer2Example example);

    int deleteByExample(CaaeBuyer2Example example);

    int deleteByPrimaryKey(String uuid);

    int insert(CaaeBuyer2 record);

    int insertSelective(CaaeBuyer2 record);

    List<CaaeBuyer2> selectByExample(CaaeBuyer2Example example);

    CaaeBuyer2 selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") CaaeBuyer2 record, @Param("example") CaaeBuyer2Example example);

    int updateByExample(@Param("record") CaaeBuyer2 record, @Param("example") CaaeBuyer2Example example);

    int updateByPrimaryKeySelective(CaaeBuyer2 record);

    int updateByPrimaryKey(CaaeBuyer2 record);
}