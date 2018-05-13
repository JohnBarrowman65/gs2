<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>广商GO平台商品管理</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
     <div class="row">
        <div class="col-md-4">

        </div>
        <div class="col-md-4">
            <form class="form-signin" method="post" action="${pageContext.request.contextPath}/checkLogin">
                <h2 class="form-signin-heading">登录到商品管理页面</h2>
                <label for="">用户名</label>
                <input type="text" name="username" id="username" class="form-control" placeholder="请输入用户名" required autofocus><br>
                <label for="">密码</label>
                <input type="password" name="password" id="password" class="form-control" placeholder="请输入密码" required>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me" checked="checked"> 记住密码
                    </label>
                </div>
                <button type="submit" class="btn btn-primary" id="btn-login">登录</button>
                <a href="reg.jsp" class="btn btn-default">注册</a>
            </form>
        </div>
        <div class="col-md-4">
        </div>
    </div>
    </div>
</body>
</html>