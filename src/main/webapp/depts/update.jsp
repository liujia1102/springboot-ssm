<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/depts/update" method="post">
	<input type="hidden" name="did" value="${dept.did }" />
		deptname:<input type="text" name="dname" value="${dept.dname }" />
		<button type="submit">修改</button>
	</form>
</body>
</html>