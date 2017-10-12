package com.jmj.dao2;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity2.CaaeAddPub2;
import com.jmj.entity2.CaaeAddPub2Example;

public interface CaaeAddPub2Mapper {
    int countByExample(CaaeAddPub2Example example);

    int deleteByExample(CaaeAddPub2Example example);

    int deleteByPrimaryKey(String addPubId);

    int insert(CaaeAddPub2 record);

    int insertSelective(CaaeAddPub2 record);

    List<CaaeAddPub2> selectByExample(CaaeAddPub2Example example);

    CaaeAddPub2 selectByPrimaryKey(String addPubId);

    int updateByExampleSelective(@Param("record") CaaeAddPub2 record, @Param("example") CaaeAddPub2Example example);

    int updateByExample(@Param("record") CaaeAddPub2 record, @Param("example") CaaeAddPub2Example example);

    int updateByPrimaryKeySelective(CaaeAddPub2 record);

    int updateByPrimaryKey(CaaeAddPub2 record);
}