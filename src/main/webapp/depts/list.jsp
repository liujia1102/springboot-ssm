<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
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
			<th>部门id</th>
			<th>部门名称</th>
			<th>操作</th>
		</tr>
		<s:forEach items="${page.list}" var="d">
			<tr>
				<th>${d.did }</th>
				<th>${d.dname }</th>
				<th>
					<a type="button" class="btn btn-primary btn-sm" href="/depts/updateUI/${d.did }">修改</a>&nbsp;&nbsp;&nbsp;
					<a type="button" class="btn btn-danger btn-sm" href="/depts/delete/${d.did }">删除</a>
				</th>
			</tr>
		</s:forEach>
		<tr>
		<td colspan="3">
			<s:if test="${page.p>1 }">
				<a href="/depts/findAll?p=1">首页</a>&nbsp;
			</s:if>
			<a href="/depts/findAll?p=${page.prev}">上一页</a>&nbsp;
			<s:forEach begin="${page.startPage }" end="${page.endPage}" var="x">
				<s:if test="${x==page.p }">
				<font color="red">${x}</font>
				</s:if>
				<s:if test="${x!=page.p }">
				<a href="/depts/findAll?p=${x }">${x}</a>
				</s:if>
			
			</s:forEach>
			<s:if test="${p==page.maxPage }">
				${p=page.maxPage}
			</s:if>
			<a href="/depts/findAll?p=${page.next}">下一页</a>&nbsp;
			<s:if test="${page.p<page.maxPage }">
				<a href="/depts/findAll?p=${page.endPage}">尾页</a>
			</s:if>
			跳转至第
			<form action="/depts/findAll" style="display: inline;">
				<input type="text" size="1" name="p" value="${page.p}"/>
				<button type="submit">go</button>
			</form>
			页
		</td>
		
		</tr>
	</table>
</body>
</html>