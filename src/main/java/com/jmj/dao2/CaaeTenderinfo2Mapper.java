package com.jmj.dao2;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity2.CaaeTenderinfo2;
import com.jmj.entity2.CaaeTenderinfo2Example;

public interface CaaeTenderinfo2Mapper {
    int countByExample(CaaeTenderinfo2Example example);

    int deleteByExample(CaaeTenderinfo2Example example);

    int deleteByPrimaryKey(String tenderInfoId);

    int insert(CaaeTenderinfo2 record);

    int insertSelective(CaaeTenderinfo2 record);

    List<CaaeTenderinfo2> selectByExample(CaaeTenderinfo2Example example);

    CaaeTenderinfo2 selectByPrimaryKey(String tenderInfoId);

    int updateByExampleSelective(@Param("record") CaaeTenderinfo2 record, @Param("example") CaaeTenderinfo2Example example);

    int updateByExample(@Param("record") CaaeTenderinfo2 record, @Param("example") CaaeTenderinfo2Example example);

    int updateByPrimaryKeySelective(CaaeTenderinfo2 record);

    int updateByPrimaryKey(CaaeTenderinfo2 record);
}