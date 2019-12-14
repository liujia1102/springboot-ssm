package com.woniu.service;

import java.util.List;

import com.woniu.domain.Dept;

public interface DeptService {
	void save(Dept dept);

	void update(Dept dept);

	void delete(Integer did);

	Dept findOne(Integer did);

	List<Dept> findAll(Dept dept);
}
