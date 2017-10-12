package com.jmj.dao;

import com.jmj.entity.CaaeAssess;
import com.jmj.entity.CaaeAssessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaaeAssessMapper {
    int countByExample(CaaeAssessExample example);

    int deleteByExample(CaaeAssessExample example);

    int deleteByPrimaryKey(String assessId);

    int insert(CaaeAssess record);

    int insertSelective(CaaeAssess record);

    List<CaaeAssess> selectByExample(CaaeAssessExample example);

    CaaeAssess selectByPrimaryKey(String assessId);

    int updateByExampleSelective(@Param("record") CaaeAssess record, @Param("example") CaaeAssessExample example);

    int updateByExample(@Param("record") CaaeAssess record, @Param("example") CaaeAssessExample example);

    int updateByPrimaryKeySelective(CaaeAssess record);

    int updateByPrimaryKey(CaaeAssess record);
}