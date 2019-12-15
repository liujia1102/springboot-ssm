package com.woniu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.domain.Dept;
import com.woniu.domain.Emp;
import com.woniu.domain.Page;
import com.woniu.service.DeptService;
import com.woniu.service.EmpService;

@Controller
@RequestMapping("emps")
public class EmpController {
	@Autowired
	private EmpService es;
	
	@Autowired
	private DeptService ds;
	
	@RequestMapping("save")
	public String save(Emp emp) {
		es.save(emp);
		return "emps/list";
	}
	
	@RequestMapping("findAll")
	public String findAll(Model model,Integer p) {
		if(p == null) {
			p=1;
		}
		Page page = es.findPageData(p, 5);
		List<Dept> deptList = ds.findAll();
		//List<Emp> empList = es.findAll();
		model.addAttribute("page", page);
		model.addAttribute("deptList", deptList);
		//System.out.println(deptList);
		return "emps/list";
	}
	@RequestMapping("delete/{eid}")
	public String delete(@PathVariable Integer eid) {
		es.delete(eid);
		return "redirect:/emps/findAll";
	}
	@RequestMapping("updateUI/{eid}")
	public String findOne(@PathVariable Integer eid,Model model) {
		Emp emp = es.findOne(eid);
		model.addAttribute("emp", emp);
		return "emps/update";
	}
	
}
