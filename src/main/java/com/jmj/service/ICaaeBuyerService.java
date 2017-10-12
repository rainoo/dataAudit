package com.jmj.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity.CaaeBuyer;
import com.jmj.entity.CaaeBuyerExample;

public interface ICaaeBuyerService {
	int countByExample(CaaeBuyerExample example);

    int deleteByExample(CaaeBuyerExample example);

    int deleteByPrimaryKey(String buyerId);

    int insert(CaaeBuyer record);

    int insertSelective(CaaeBuyer record);

    List<CaaeBuyer> selectByExample(CaaeBuyerExample example);

    CaaeBuyer selectByPrimaryKey(String buyerId);

    int updateByExampleSelective(@Param("record") CaaeBuyer record, @Param("example") CaaeBuyerExample example);

    int updateByExample(@Param("record") CaaeBuyer record, @Param("example") CaaeBuyerExample example);

    int updateByPrimaryKeySelective(CaaeBuyer record);

    int updateByPrimaryKey(CaaeBuyer record);
}
