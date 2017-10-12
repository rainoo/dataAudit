package com.jmj.dao2;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity2.CaaeSpecies2;
import com.jmj.entity2.CaaeSpecies2Example;

public interface CaaeSpecies2Mapper {
    int countByExample(CaaeSpecies2Example example);

    int deleteByExample(CaaeSpecies2Example example);

    int deleteByPrimaryKey(String speciesId);

    int insert(CaaeSpecies2 record);

    int insertSelective(CaaeSpecies2 record);

    List<CaaeSpecies2> selectByExample(CaaeSpecies2Example example);

    CaaeSpecies2 selectByPrimaryKey(String speciesId);

    int updateByExampleSelective(@Param("record") CaaeSpecies2 record, @Param("example") CaaeSpecies2Example example);

    int updateByExample(@Param("record") CaaeSpecies2 record, @Param("example") CaaeSpecies2Example example);

    int updateByPrimaryKeySelective(CaaeSpecies2 record);

    int updateByPrimaryKey(CaaeSpecies2 record);
}