package com.woniu.domain;

import java.util.List;

public class Page<T> {
	private int p;// 当前页
	private int rowCount;// 总行数
	private int maxPage;// 总页数
	private int prev;// 上一页
	private int next;// 下一页
	private int startLine;// 起始行
	private int size;// 每页显示数目
	private int startPage;// 起始页
	private int endPage;// 结束页
	private List<T> list;// 每页显示的数据

	/*
	 * 通过以下三个参数可以把其他参数计算出来 总页数maxPage=总行数rowCount/每页显示数目size，并且向上取整
	 * 
	 */
	public Page(int pg, int rc, int sz) {
		p = pg;
		rowCount = rc;
		size = sz;
		// 计算总页数
		maxPage = (int) Math.ceil(rowCount * 1.0 / size);
		// p的有效范围是1~maxPage
		if (p < 1)
			p = 1;
		if (p > maxPage)
			p = maxPage;
		prev = p - 1;// 上一页=当前页-1
		next = p + 1;// 下一页=当前页+1
		/*
		 * select * from dept limt 1-1（起始行），5（每页显示数目） 第一页 select * from dept limt
		 * 2-1（起始行），5（每页显示数目） 第二页
		 */
		startLine = (p - 1) * size;// 计算起始行
		if (maxPage < 10) {
			startPage = 1;
			endPage = maxPage;
		} else {
			startPage = p - 5;
			endPage = p + 4;
			if (startPage < 1) {
				startPage = 1;
				endPage = maxPage;
			}
			if (endPage > maxPage) {
				startPage = p - 9;
				endPage = maxPage;
			}
		}
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public int getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}

	public int getPrev() {
		return prev;
	}

	public void setPrev(int prev) {
		this.prev = prev;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

	public int getStartLine() {
		return startLine;
	}

	public void setStartLine(int startLine) {
		this.startLine = startLine;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}