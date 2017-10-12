package com.jmj.dao;

import com.jmj.entity.CaaeSpecies;
import com.jmj.entity.CaaeSpeciesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaaeSpeciesMapper {
    int countByExample(CaaeSpeciesExample example);

    int deleteByExample(CaaeSpeciesExample example);

    int deleteByPrimaryKey(String speciesId);

    int insert(CaaeSpecies record);

    int insertSelective(CaaeSpecies record);

    List<CaaeSpecies> selectByExample(CaaeSpeciesExample example);

    CaaeSpecies selectByPrimaryKey(String speciesId);

    int updateByExampleSelective(@Param("record") CaaeSpecies record, @Param("example") CaaeSpeciesExample example);

    int updateByExample(@Param("record") CaaeSpecies record, @Param("example") CaaeSpeciesExample example);

    int updateByPrimaryKeySelective(CaaeSpecies record);

    int updateByPrimaryKey(CaaeSpecies record);
}