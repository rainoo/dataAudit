package com.jmj.dao;

import com.jmj.entity.CaaeBuyer;
import com.jmj.entity.CaaeBuyerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaaeBuyerMapper {
    int countByExample(CaaeBuyerExample example);

    int deleteByExample(CaaeBuyerExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(CaaeBuyer record);

    int insertSelective(CaaeBuyer record);

    List<CaaeBuyer> selectByExample(CaaeBuyerExample example);

    CaaeBuyer selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") CaaeBuyer record, @Param("example") CaaeBuyerExample example);

    int updateByExample(@Param("record") CaaeBuyer record, @Param("example") CaaeBuyerExample example);

    int updateByPrimaryKeySelective(CaaeBuyer record);

    int updateByPrimaryKey(CaaeBuyer record);
}