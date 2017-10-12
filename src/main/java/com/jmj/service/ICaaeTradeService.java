package com.jmj.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity.CaaeTrade;
import com.jmj.entity.CaaeTradeExample;

public interface ICaaeTradeService {
	int countByExample(CaaeTradeExample example);

    int deleteByExample(CaaeTradeExample example);

    int deleteByPrimaryKey(String tradeId);

    int insert(CaaeTrade record);

    int insertSelective(CaaeTrade record);

    List<CaaeTrade> selectByExample(CaaeTradeExample example);

    CaaeTrade selectByPrimaryKey(String tradeId);

    int updateByExampleSelective(@Param("record") CaaeTrade record, @Param("example") CaaeTradeExample example);

    int updateByExample(@Param("record") CaaeTrade record, @Param("example") CaaeTradeExample example);

    int updateByPrimaryKeySelective(CaaeTrade record);

    int updateByPrimaryKey(CaaeTrade record);
}
