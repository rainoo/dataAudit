package com.jmj.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity.CaaeTenderinfo;
import com.jmj.entity.CaaeTenderinfoExample;

public interface ICaaeTenderinfoService {
	int countByExample(CaaeTenderinfoExample example);

    int deleteByExample(CaaeTenderinfoExample example);

    int deleteByPrimaryKey(String tenderInfoId);

    int insert(CaaeTenderinfo record);

    int insertSelective(CaaeTenderinfo record);

    List<CaaeTenderinfo> selectByExample(CaaeTenderinfoExample example);

    CaaeTenderinfo selectByPrimaryKey(String tenderInfoId);

    int updateByExampleSelective(@Param("record") CaaeTenderinfo record, @Param("example") CaaeTenderinfoExample example);

    int updateByExample(@Param("record") CaaeTenderinfo record, @Param("example") CaaeTenderinfoExample example);

    int updateByPrimaryKeySelective(CaaeTenderinfo record);

    int updateByPrimaryKey(CaaeTenderinfo record);
}
