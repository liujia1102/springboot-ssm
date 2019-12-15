package com.woniu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.EmpMapper;
import com.woniu.domain.Dept;
import com.woniu.domain.Emp;
import com.woniu.domain.Page;
import com.woniu.service.EmpService;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpMapper empMapper;

	@Override
	public void save(Emp emp) {
		empMapper.insert(emp);
	}

	@Override
	public void delete(Integer eid) {
		empMapper.deleteByPrimaryKey(eid);
	}

	@Override
	public void update(Emp emp) {
		empMapper.updateByPrimaryKeySelective(emp);
	}

	@Override
	public Emp findOne(Integer eid) {
		// TODO Auto-generated method stub
		return empMapper.selectByPrimaryKey(eid);
	}

	@Override
	public List<Emp> findAll() {
		// TODO Auto-generated method stub
		return empMapper.selectByExample(null);
	}

	@Override
	public Page findPageData(int p, int size) {
		int rowCount = (int) empMapper.countByExample(null);
		Page page = new Page(p, rowCount, size);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("startLine", page.getStartLine());
		map.put("size", size);
		List<Emp> list = empMapper.selectByPage(map);
		page.setList(list);
		return page;
	}

	@Override
	public List<Emp> selectWithDept() {
		
		return null;
	}

}
