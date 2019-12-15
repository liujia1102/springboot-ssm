<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/depts/save" method="post">
		deptname:<input type="text" name="dname" />
		<button type="submit">添加</button>
	</form>
</body>
</html>