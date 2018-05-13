<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<title>登录成功！</title>
</head>

<body>
<div class="container">
     <div class="row">
        <div class="col-md-4">

        </div>
        <div class="col-md-4">
        	<h2 class="form-signin-heading">
        		欢迎,${sessionScope.admin.username}!
        	</h2>
        	 <button type="submit" class="btn btn-primary" id="btn-login"onclick="window.location='${pageContext.request.contextPath}/admin'">点击跳转商品管理页面</button>
        	
        </div>
        </div>
        </div>
     

</body>
</html>