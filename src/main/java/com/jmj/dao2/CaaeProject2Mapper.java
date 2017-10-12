package com.jmj.dao2;

import com.jmj.entity.CaaeProject2;
import com.jmj.entity.CaaeProject2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaaeProject2Mapper {
    int countByExample(CaaeProject2Example example);

    int deleteByExample(CaaeProject2Example example);

    int deleteByPrimaryKey(String proTransId);

    int insert(CaaeProject2 record);

    int insertSelective(CaaeProject2 record);

    List<CaaeProject2> selectByExample(CaaeProject2Example example);

    CaaeProject2 selectByPrimaryKey(String proTransId);

    int updateByExampleSelective(@Param("record") CaaeProject2 record, @Param("example") CaaeProject2Example example);

    int updateByExample(@Param("record") CaaeProject2 record, @Param("example") CaaeProject2Example example);

    int updateByPrimaryKeySelective(CaaeProject2 record);

    int updateByPrimaryKey(CaaeProject2 record);
}