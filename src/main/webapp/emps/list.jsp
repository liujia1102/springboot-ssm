<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<table class="table table-hover table-bordered">
		<tr>
			<th>员工id</th>
			<th>员工姓名</th>
			<th>员工性别</th>
			<th>月薪</th>
			<th>雇佣日期</th>
			<th>头像</th>
			<th>所属部门</th>
			<th>操作</th>
		</tr>
		<s:forEach items="${page.list}" var="e">
			<tr>
				<th>${e.eid }</th>
				<th>${e.ename }</th>
				<th>${e.gender }</th>
				<th>${e.sal }</th>
				<th><fmt:formatDate value="${e.hiredate }" pattern="yyyy-MM-dd"></fmt:formatDate></th>
				<th>${e.photo }</th>
				<th>
				<s:forEach items="${deptList }" var="d">
				<s:if test="${e.did == d.did }">
					${d.dname }
				</s:if>
				</s:forEach>
				
				</th>
				<th>
					<a type="button" class="btn btn-primary btn-sm" href="/emps/updateUI/${e.eid }">修改</a>&nbsp;&nbsp;&nbsp;
					<a type="button" class="btn btn-danger btn-sm" href="/emps/delete/${e.eid }">删除</a>
				</th>
			</tr>
		</s:forEach>
		<tr>
		<td colspan="8">
			<s:if test="${page.p>1 }">
				<a href="/emps/findAll?p=1">首页</a>&nbsp;
			</s:if>
			<a href="/emps/findAll?p=${page.prev}">上一页</a>&nbsp;
			<s:forEach begin="${page.startPage }" end="${page.endPage}" var="x">
				<s:if test="${x==page.p }">
				<font color="red">${x}</font>
				</s:if>
				<s:if test="${x!=page.p }">
				<a href="/emps/findAll?p=${x }">${x}</a>
				</s:if>
			
			</s:forEach>
			<s:if test="${p==page.maxPage }">
				${p=page.maxPage}
			</s:if>
			<a href="/emps/findAll?p=${page.next}">下一页</a>&nbsp;
			<s:if test="${page.p<page.maxPage }">
				<a href="/emps/findAll?p=${page.endPage}">尾页</a>
			</s:if>
			跳转至第
			<form action="/emps/findAll" style="display: inline;">
				<input type="text" size="1" name="p" value="${page.p}"/>
				<button type="submit">go</button>
			</form>
			页
		</td>
		
		</tr>
	</table>
</body>
</html>