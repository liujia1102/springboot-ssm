<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.bootcss.com/twitter-bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet">

<meta charset="utf-8">
<title>Insert title here</title>
<style type="text/css">
#div1 {
	margin-top: 10px;
}
</style>
</head>
<body>
	<div class="container" id="div1" ">
		<div class="row" style="height: 700px;">
			<div class="col-md-2">
				<ul>
					<li>部门管理</li>
					<ul>
						<li><a href="/depts/findAll?p=1" target="if">查看部门</a></li>
						<li><a href="/depts/add.jsp" target="if">添加部门</a></li>
					</ul>
				</ul>
				<ul>
					<li>员工管理</li>
					<ul>
						<li><a href="/emps/findAll?p=1" target="if">查看员工</a></li>
						<li><a href="/emps/add.jsp" target="if">添加员工</a></li>
					</ul>
				</ul>

			</div>
			<div class="col-md-10">
				<iframe name="if" width="100%" height="100%"></iframe>
			</div>
		</div>
	</div>
</body>
</html>