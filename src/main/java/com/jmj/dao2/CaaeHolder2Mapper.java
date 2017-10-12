package com.jmj.dao2;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity2.CaaeHolder2;
import com.jmj.entity2.CaaeHolder2Example;

public interface CaaeHolder2Mapper {
    int countByExample(CaaeHolder2Example example);

    int deleteByExample(CaaeHolder2Example example);

    int deleteByPrimaryKey(String holderId);

    int insert(CaaeHolder2 record);

    int insertSelective(CaaeHolder2 record);

    List<CaaeHolder2> selectByExample(CaaeHolder2Example example);

    CaaeHolder2 selectByPrimaryKey(String holderId);

    int updateByExampleSelective(@Param("record") CaaeHolder2 record, @Param("example") CaaeHolder2Example example);

    int updateByExample(@Param("record") CaaeHolder2 record, @Param("example") CaaeHolder2Example example);

    int updateByPrimaryKeySelective(CaaeHolder2 record);

    int updateByPrimaryKey(CaaeHolder2 record);
}