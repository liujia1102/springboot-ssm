package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.DeptMapper;
import com.woniu.domain.Dept;
import com.woniu.service.DeptService;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptMapper deptMapper;

	@Override
	public void save(Dept dept) {
		deptMapper.insert(dept);
	}

	@Override
	public void update(Dept dept) {
		deptMapper.updateByPrimaryKeySelective(dept);
	}

	@Override
	public void delete(Integer did) {
		deptMapper.deleteByPrimaryKey(did);
	}

	@Override
	public Dept findOne(Integer did) {
		return deptMapper.selectByPrimaryKey(did);
	}

	@Override
	public List<Dept> findAll() {
		return deptMapper.selectByExample(null);
	}

}
