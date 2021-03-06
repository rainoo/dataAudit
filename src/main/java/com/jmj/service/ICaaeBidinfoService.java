package com.jmj.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity.CaaeBidinfo;
import com.jmj.entity.CaaeBidinfoExample;

public interface ICaaeBidinfoService {
	int countByExample(CaaeBidinfoExample example);

    int deleteByExample(CaaeBidinfoExample example);

    int deleteByPrimaryKey(String bidInfoId);

    int insert(CaaeBidinfo record);

    int insertSelective(CaaeBidinfo record);

    List<CaaeBidinfo> selectByExample(CaaeBidinfoExample example);

    CaaeBidinfo selectByPrimaryKey(String bidInfoId);

    int updateByExampleSelective(@Param("record") CaaeBidinfo record, @Param("example") CaaeBidinfoExample example);

    int updateByExample(@Param("record") CaaeBidinfo record, @Param("example") CaaeBidinfoExample example);

    int updateByPrimaryKeySelective(CaaeBidinfo record);

    int updateByPrimaryKey(CaaeBidinfo record);
}
