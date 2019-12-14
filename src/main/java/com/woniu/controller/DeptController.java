package com.woniu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.domain.Dept;
import com.woniu.service.DeptService;

@Controller
@RequestMapping("depts")
public class DeptController {
	
	@Autowired
	private DeptService ds;
	
	@RequestMapping("save")
	@ResponseBody
	public String save(Dept dept) {
		ds.save(dept);
		return null;
	}
}
