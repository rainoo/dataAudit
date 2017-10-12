package com.jmj.dao;

import com.jmj.entity.CaaeSeller;
import com.jmj.entity.CaaeSellerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaaeSellerMapper {
    int countByExample(CaaeSellerExample example);

    int deleteByExample(CaaeSellerExample example);

    int deleteByPrimaryKey(String sellerId);

    int insert(CaaeSeller record);

    int insertSelective(CaaeSeller record);

    List<CaaeSeller> selectByExample(CaaeSellerExample example);

    CaaeSeller selectByPrimaryKey(String sellerId);

    int updateByExampleSelective(@Param("record") CaaeSeller record, @Param("example") CaaeSellerExample example);

    int updateByExample(@Param("record") CaaeSeller record, @Param("example") CaaeSellerExample example);

    int updateByPrimaryKeySelective(CaaeSeller record);

    int updateByPrimaryKey(CaaeSeller record);
}