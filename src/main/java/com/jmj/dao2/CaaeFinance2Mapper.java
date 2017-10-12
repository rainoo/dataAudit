package com.jmj.dao2;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity2.CaaeFinance2;
import com.jmj.entity2.CaaeFinance2Example;

public interface CaaeFinance2Mapper {
    int countByExample(CaaeFinance2Example example);

    int deleteByExample(CaaeFinance2Example example);

    int deleteByPrimaryKey(String financeId);

    int insert(CaaeFinance2 record);

    int insertSelective(CaaeFinance2 record);

    List<CaaeFinance2> selectByExample(CaaeFinance2Example example);

    CaaeFinance2 selectByPrimaryKey(String financeId);

    int updateByExampleSelective(@Param("record") CaaeFinance2 record, @Param("example") CaaeFinance2Example example);

    int updateByExample(@Param("record") CaaeFinance2 record, @Param("example") CaaeFinance2Example example);

    int updateByPrimaryKeySelective(CaaeFinance2 record);

    int updateByPrimaryKey(CaaeFinance2 record);
}