package com.jmj.dao;

import com.jmj.entity.CaaeHolder;
import com.jmj.entity.CaaeHolderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaaeHolderMapper {
    int countByExample(CaaeHolderExample example);

    int deleteByExample(CaaeHolderExample example);

    int deleteByPrimaryKey(String holderId);

    int insert(CaaeHolder record);

    int insertSelective(CaaeHolder record);

    List<CaaeHolder> selectByExample(CaaeHolderExample example);

    CaaeHolder selectByPrimaryKey(String holderId);

    int updateByExampleSelective(@Param("record") CaaeHolder record, @Param("example") CaaeHolderExample example);

    int updateByExample(@Param("record") CaaeHolder record, @Param("example") CaaeHolderExample example);

    int updateByPrimaryKeySelective(CaaeHolder record);

    int updateByPrimaryKey(CaaeHolder record);
}