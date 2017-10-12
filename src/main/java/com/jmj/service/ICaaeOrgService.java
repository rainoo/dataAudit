package com.jmj.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jmj.entity.CaaeOrg;
import com.jmj.entity.CaaeOrgExample;

public interface ICaaeOrgService {
	int countByExample(CaaeOrgExample example);

	int deleteByExample(CaaeOrgExample example);

	int deleteByPrimaryKey(String orgId);

	int insert(CaaeOrg record);

	int insertSelective(CaaeOrg record);

	List<CaaeOrg> selectByExample(CaaeOrgExample example);

	CaaeOrg selectByPrimaryKey(String orgId);

	int updateByExampleSelective(@Param("record") CaaeOrg record,
			@Param("example") CaaeOrgExample example);

	int updateByExample(@Param("record") CaaeOrg record,
			@Param("example") CaaeOrgExample example);

	int updateByPrimaryKeySelective(CaaeOrg record);

	int updateByPrimaryKey(CaaeOrg record);
}
