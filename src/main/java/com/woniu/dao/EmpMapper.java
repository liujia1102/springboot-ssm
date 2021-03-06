package com.woniu.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.woniu.domain.Emp;
import com.woniu.domain.EmpExample;

public interface EmpMapper {
	long countByExample(EmpExample example);

	int deleteByExample(EmpExample example);

	int deleteByPrimaryKey(Integer eid);

	int insert(Emp record);

	int insertSelective(Emp record);

	List<Emp> selectByExample(EmpExample example);

	Emp selectByPrimaryKey(Integer eid);

	int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpExample example);

	int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

	int updateByPrimaryKeySelective(Emp record);

	int updateByPrimaryKey(Emp record);

	List<Emp> selectByPage(Map map);
	
	List<Emp> selectWithEmp();
}