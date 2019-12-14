package com.woniu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Dept;
import com.woniu.service.DeptService;

@Controller
@RequestMapping("depts")
public class DeptController {
	
	@Autowired
	private DeptService ds;
	
	@RequestMapping("save")
	public String save(Dept dept) {
		ds.save(dept);
		return "redirect:/depts/findAll";
	}
	@RequestMapping("findAll")
	public String findAll(Model model) {
		List<Dept> deptList = ds.findAll();
		model.addAttribute("deptList", deptList);
		return "depts/list";
	}
	@RequestMapping("delete/{did}")
	public String delete(@PathVariable Integer did) {
		ds.delete(did);
		return "redirect:/depts/findAll";
	}
	
}
