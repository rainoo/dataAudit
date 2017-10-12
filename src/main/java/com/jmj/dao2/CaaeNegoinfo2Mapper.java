package com.jmj.dao2;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity2.CaaeNegoinfo2;
import com.jmj.entity2.CaaeNegoinfo2Example;

public interface CaaeNegoinfo2Mapper {
    int countByExample(CaaeNegoinfo2Example example);

    int deleteByExample(CaaeNegoinfo2Example example);

    int deleteByPrimaryKey(String negoInfoId);

    int insert(CaaeNegoinfo2 record);

    int insertSelective(CaaeNegoinfo2 record);

    List<CaaeNegoinfo2> selectByExample(CaaeNegoinfo2Example example);

    CaaeNegoinfo2 selectByPrimaryKey(String negoInfoId);

    int updateByExampleSelective(@Param("record") CaaeNegoinfo2 record, @Param("example") CaaeNegoinfo2Example example);

    int updateByExample(@Param("record") CaaeNegoinfo2 record, @Param("example") CaaeNegoinfo2Example example);

    int updateByPrimaryKeySelective(CaaeNegoinfo2 record);

    int updateByPrimaryKey(CaaeNegoinfo2 record);
}