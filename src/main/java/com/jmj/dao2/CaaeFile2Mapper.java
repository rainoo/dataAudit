package com.jmj.dao2;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity2.CaaeFile2;
import com.jmj.entity2.CaaeFile2Example;

public interface CaaeFile2Mapper {
    int countByExample(CaaeFile2Example example);

    int deleteByExample(CaaeFile2Example example);

    int deleteByPrimaryKey(String fileId);

    int insert(CaaeFile2 record);

    int insertSelective(CaaeFile2 record);

    List<CaaeFile2> selectByExample(CaaeFile2Example example);

    CaaeFile2 selectByPrimaryKey(String fileId);

    int updateByExampleSelective(@Param("record") CaaeFile2 record, @Param("example") CaaeFile2Example example);

    int updateByExample(@Param("record") CaaeFile2 record, @Param("example") CaaeFile2Example example);

    int updateByPrimaryKeySelective(CaaeFile2 record);

    int updateByPrimaryKey(CaaeFile2 record);
}