package com.jmj.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity.CaaeFinance;
import com.jmj.entity.CaaeFinanceExample;

public interface ICaaeFinanceService {
	int countByExample(CaaeFinanceExample example);

    int deleteByExample(CaaeFinanceExample example);

    int deleteByPrimaryKey(String financeId);

    int insert(CaaeFinance record);

    int insertSelective(CaaeFinance record);

    List<CaaeFinance> selectByExample(CaaeFinanceExample example);

    CaaeFinance selectByPrimaryKey(String financeId);

    int updateByExampleSelective(@Param("record") CaaeFinance record, @Param("example") CaaeFinanceExample example);

    int updateByExample(@Param("record") CaaeFinance record, @Param("example") CaaeFinanceExample example);

    int updateByPrimaryKeySelective(CaaeFinance record);

    int updateByPrimaryKey(CaaeFinance record);
}
