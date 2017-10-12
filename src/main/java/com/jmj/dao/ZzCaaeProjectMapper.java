package com.jmj.dao;

import com.jmj.entity.ZzCaaeProject;
import com.jmj.entity.ZzCaaeProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZzCaaeProjectMapper {
    int countByExample(ZzCaaeProjectExample example);

    int deleteByExample(ZzCaaeProjectExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(ZzCaaeProject record);

    int insertSelective(ZzCaaeProject record);

    List<ZzCaaeProject> selectByExample(ZzCaaeProjectExample example);

    ZzCaaeProject selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") ZzCaaeProject record, @Param("example") ZzCaaeProjectExample example);

    int updateByExample(@Param("record") ZzCaaeProject record, @Param("example") ZzCaaeProjectExample example);

    int updateByPrimaryKeySelective(ZzCaaeProject record);

    int updateByPrimaryKey(ZzCaaeProject record);
}