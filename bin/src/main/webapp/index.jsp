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
	height: 700px;
}
</style>
</head>
<body>
	<div class="container" id="div1">
		<div class="row" >
			<div class="col-md-2">
				<ul>
					<li>部门管理</li>
					<ul>
						<li><a href="/depts/findAll" target="if">查看部门</a></li>
						<li><a href="/depts/add.jsp" target="if">添加部门</a></li>
					</ul>
				</ul>
				<ul>
					<li>员工管理</li>
					<ul>
						<li>查看员工</li>
						<li>添加员工</li>
					</ul>
				</ul>

			</div>
			<div class="col-md-10">
				<iframe name="if" width="100%"></iframe>
			</div>
		</div>
	</div>
</body>
</html>