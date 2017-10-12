package com.jmj.dao;

import com.jmj.entity.CaaeTenderinfo;
import com.jmj.entity.CaaeTenderinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaaeTenderinfoMapper {
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