package com.jmj.dao2;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity2.CaaeBidinfo2;
import com.jmj.entity2.CaaeBidinfo2Example;

public interface CaaeBidinfo2Mapper {
    int countByExample(CaaeBidinfo2Example example);

    int deleteByExample(CaaeBidinfo2Example example);

    int deleteByPrimaryKey(String bidInfoId);

    int insert(CaaeBidinfo2 record);

    int insertSelective(CaaeBidinfo2 record);

    List<CaaeBidinfo2> selectByExample(CaaeBidinfo2Example example);

    CaaeBidinfo2 selectByPrimaryKey(String bidInfoId);

    int updateByExampleSelective(@Param("record") CaaeBidinfo2 record, @Param("example") CaaeBidinfo2Example example);

    int updateByExample(@Param("record") CaaeBidinfo2 record, @Param("example") CaaeBidinfo2Example example);

    int updateByPrimaryKeySelective(CaaeBidinfo2 record);

    int updateByPrimaryKey(CaaeBidinfo2 record);
}