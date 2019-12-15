package com.woniu.service;

import java.util.List;

import com.woniu.domain.Dept;
import com.woniu.domain.Page;

public interface DeptService {
	void save(Dept dept);

	void update(Dept dept);

	void delete(Integer did);

	Dept findOne(Integer did);

	List<Dept> findAll();
	Page findPageDate(int p,int size);
}
