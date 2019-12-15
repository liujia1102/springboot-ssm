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
	<form action="/emps/update" method="post">
	<input type="hidden" name="eid" value="${emp.did }" />
		员工姓名:<input type="text" name="dname" value="${emp.ename }" /><br />
		性别:<input type="text" name="dname" value="${emp.gender }" /><br />
		月薪:<input type="text" name="dname" value="${emp.sal }" /><br />
		雇佣日期:<input type="text" name="dname" value="${emp.hiredate }" /><br />
		照片:<input type="file" name="dname" value="${emp.photo }" /><br />
		所属部门:<input type="text" name="dname" value="${emp.did }" /><br />
		<button type="submit">修改</button>
	</form>
</body>
</html>