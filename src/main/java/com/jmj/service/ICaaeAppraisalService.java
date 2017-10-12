package com.jmj.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity.CaaeAppraisal;
import com.jmj.entity.CaaeAppraisalExample;

public interface ICaaeAppraisalService {
    int countByExample(CaaeAppraisalExample example);

    int deleteByExample(CaaeAppraisalExample example);

    int deleteByPrimaryKey(String appraisalId);

    int insert(CaaeAppraisal record);

    int insertSelective(CaaeAppraisal record);

    List<CaaeAppraisal> selectByExample(CaaeAppraisalExample example);

    CaaeAppraisal selectByPrimaryKey(String appraisalId);

    int updateByExampleSelective(@Param("record") CaaeAppraisal record, @Param("example") CaaeAppraisalExample example);

    int updateByExample(@Param("record") CaaeAppraisal record, @Param("example") CaaeAppraisalExample example);

    int updateByPrimaryKeySelective(CaaeAppraisal record);

    int updateByPrimaryKey(CaaeAppraisal record);
}
