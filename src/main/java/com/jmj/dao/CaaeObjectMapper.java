package com.jmj.dao;

import com.jmj.entity.CaaeObject;
import com.jmj.entity.CaaeObjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaaeObjectMapper {
    int countByExample(CaaeObjectExample example);

    int deleteByExample(CaaeObjectExample example);

    int deleteByPrimaryKey(String objectId);

    int insert(CaaeObject record);

    int insertSelective(CaaeObject record);

    List<CaaeObject> selectByExample(CaaeObjectExample example);

    CaaeObject selectByPrimaryKey(String objectId);

    int updateByExampleSelective(@Param("record") CaaeObject record, @Param("example") CaaeObjectExample example);

    int updateByExample(@Param("record") CaaeObject record, @Param("example") CaaeObjectExample example);

    int updateByPrimaryKeySelective(CaaeObject record);

    int updateByPrimaryKey(CaaeObject record);
}