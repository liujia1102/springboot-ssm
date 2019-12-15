package com.woniu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.domain.Dept;
import com.woniu.domain.Page;
import com.woniu.service.DeptService;

@Controller
@RequestMapping("depts")
public class DeptController {
	
	@Autowired
	private DeptService ds;
	
	//添加
	@RequestMapping("save")
	public String save(Dept dept) {
		ds.save(dept);
		return "redirect:/depts/findAll";
	}
	//查询所有
	@RequestMapping("findAll")
	public String findAll(Model model,Integer p) {
		if(p == null) {
			p=1;
		}
		Page page = ds.findPageDate(p, 10);
		//List<Dept> deptList = ds.findAll();
		model.addAttribute("page", page);
		return "depts/list";
	}
	//删除
	@RequestMapping("delete/{did}")
	public String delete(@PathVariable Integer did) {
		ds.delete(did);
		return "redirect:/depts/findAll";
	}
	//查询出要修改的
	@RequestMapping("updateUI/{did}")
	public String findOne(@PathVariable Integer did,Model model) {
		Dept dept = ds.findOne(did);
		model.addAttribute("dept", dept);
		return "depts/update";
	}
	@RequestMapping("update")
	public String update(Dept dept) {
		ds.update(dept);
		return "redirect:/depts/findAll";
	}
	
}
