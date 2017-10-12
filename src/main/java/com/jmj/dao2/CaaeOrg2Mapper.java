package com.jmj.dao2;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity2.CaaeOrg2;
import com.jmj.entity2.CaaeOrg2Example;

public interface CaaeOrg2Mapper {
    int countByExample(CaaeOrg2Example example);

    int deleteByExample(CaaeOrg2Example example);

    int deleteByPrimaryKey(String orgId);

    int insert(CaaeOrg2 record);

    int insertSelective(CaaeOrg2 record);

    List<CaaeOrg2> selectByExample(CaaeOrg2Example example);

    CaaeOrg2 selectByPrimaryKey(String orgId);

    int updateByExampleSelective(@Param("record") CaaeOrg2 record, @Param("example") CaaeOrg2Example example);

    int updateByExample(@Param("record") CaaeOrg2 record, @Param("example") CaaeOrg2Example example);

    int updateByPrimaryKeySelective(CaaeOrg2 record);

    int updateByPrimaryKey(CaaeOrg2 record);
}