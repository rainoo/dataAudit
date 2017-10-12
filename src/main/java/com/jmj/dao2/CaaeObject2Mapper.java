package com.jmj.dao2;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity2.CaaeObject2;
import com.jmj.entity2.CaaeObject2Example;

public interface CaaeObject2Mapper {
    int countByExample(CaaeObject2Example example);

    int deleteByExample(CaaeObject2Example example);

    int deleteByPrimaryKey(String objectId);

    int insert(CaaeObject2 record);

    int insertSelective(CaaeObject2 record);

    List<CaaeObject2> selectByExample(CaaeObject2Example example);

    CaaeObject2 selectByPrimaryKey(String objectId);

    int updateByExampleSelective(@Param("record") CaaeObject2 record, @Param("example") CaaeObject2Example example);

    int updateByExample(@Param("record") CaaeObject2 record, @Param("example") CaaeObject2Example example);

    int updateByPrimaryKeySelective(CaaeObject2 record);

    int updateByPrimaryKey(CaaeObject2 record);
}