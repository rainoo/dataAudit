package com.jmj.dao2;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity2.CaaeAppraisal2;
import com.jmj.entity2.CaaeAppraisal2Example;

public interface CaaeAppraisal2Mapper {
    int countByExample(CaaeAppraisal2Example example);

    int deleteByExample(CaaeAppraisal2Example example);

    int deleteByPrimaryKey(String appraisalId);

    int insert(CaaeAppraisal2 record);

    int insertSelective(CaaeAppraisal2 record);

    List<CaaeAppraisal2> selectByExample(CaaeAppraisal2Example example);

    CaaeAppraisal2 selectByPrimaryKey(String appraisalId);

    int updateByExampleSelective(@Param("record") CaaeAppraisal2 record, @Param("example") CaaeAppraisal2Example example);

    int updateByExample(@Param("record") CaaeAppraisal2 record, @Param("example") CaaeAppraisal2Example example);

    int updateByPrimaryKeySelective(CaaeAppraisal2 record);

    int updateByPrimaryKey(CaaeAppraisal2 record);
}