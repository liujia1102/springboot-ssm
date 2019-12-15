package com.woniu.service;

import java.util.List;

import com.woniu.domain.Emp;
import com.woniu.domain.Page;

public interface EmpService {
	void save(Emp emp);

	void delete(Integer eid);

	void update(Emp emp);

	Emp findOne(Integer eid);

	List<Emp> findAll();
	
	Page findPageData(int p,int size);
	
	List<Emp> selectWithDept();
}
