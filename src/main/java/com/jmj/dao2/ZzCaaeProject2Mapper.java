package com.jmj.dao2;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity2.ZzCaaeProject2;
import com.jmj.entity2.ZzCaaeProject2Example;

public interface ZzCaaeProject2Mapper {
    int countByExample(ZzCaaeProject2Example example);

    int deleteByExample(ZzCaaeProject2Example example);

    int deleteByPrimaryKey(String uuid);

    int insert(ZzCaaeProject2 record);

    int insertSelective(ZzCaaeProject2 record);

    List<ZzCaaeProject2> selectByExample(ZzCaaeProject2Example example);

    ZzCaaeProject2 selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") ZzCaaeProject2 record, @Param("example") ZzCaaeProject2Example example);

    int updateByExample(@Param("record") ZzCaaeProject2 record, @Param("example") ZzCaaeProject2Example example);

    int updateByPrimaryKeySelective(ZzCaaeProject2 record);

    int updateByPrimaryKey(ZzCaaeProject2 record);
}