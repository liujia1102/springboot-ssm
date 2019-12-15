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
		<s:forEach items="${deptList}" var="d">
			<tr>
				<th>${d.did }</th>
				<th>${d.dname }</th>
				<th>
					<a type="button" class="btn btn-primary btn-sm">修改</a>&nbsp;&nbsp;&nbsp;
					<a type="button" class="btn btn-danger btn-sm" href="/depts/delete/${d.did }">删除</a>
				</th>
			</tr>
		</s:forEach>
	</table>
</body>
</html>