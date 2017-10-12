package com.jmj.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity.CaaeAddPub;
import com.jmj.entity.CaaeAddPubExample;

public interface ICaaeAddPubService {
    int countByExample(CaaeAddPubExample example);

    int deleteByExample(CaaeAddPubExample example);

    int deleteByPrimaryKey(String addPubId);

    int insert(CaaeAddPub record);

    int insertSelective(CaaeAddPub record);

    List<CaaeAddPub> selectByExample(CaaeAddPubExample example);

    CaaeAddPub selectByPrimaryKey(String addPubId);

    int updateByExampleSelective(@Param("record") CaaeAddPub record, @Param("example") CaaeAddPubExample example);

    int updateByExample(@Param("record") CaaeAddPub record, @Param("example") CaaeAddPubExample example);

    int updateByPrimaryKeySelective(CaaeAddPub record);

    int updateByPrimaryKey(CaaeAddPub record);
}
