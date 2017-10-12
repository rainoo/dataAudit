package com.jmj.dao2;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity2.CaaeTrade2;
import com.jmj.entity2.CaaeTrade2Example;

public interface CaaeTrade2Mapper {
    int countByExample(CaaeTrade2Example example);

    int deleteByExample(CaaeTrade2Example example);

    int deleteByPrimaryKey(String tradeId);

    int insert(CaaeTrade2 record);

    int insertSelective(CaaeTrade2 record);

    List<CaaeTrade2> selectByExample(CaaeTrade2Example example);

    CaaeTrade2 selectByPrimaryKey(String tradeId);

    int updateByExampleSelective(@Param("record") CaaeTrade2 record, @Param("example") CaaeTrade2Example example);

    int updateByExample(@Param("record") CaaeTrade2 record, @Param("example") CaaeTrade2Example example);

    int updateByPrimaryKeySelective(CaaeTrade2 record);

    int updateByPrimaryKey(CaaeTrade2 record);
}