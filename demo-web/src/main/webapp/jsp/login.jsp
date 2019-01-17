<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>登录页</title>
</head>
<body>
<form action="/demo/login" method="get">
	用户名:<input type="text" name="username"/><br />
	密码:<input type="password" name="password"/><br />
	<button id="btn-login" value="">登录</button>
</form>

</body>
<script type="text/javascript" src="../common/js/commonJs.js"></script>
<script type="text/javascript">
$(function(){
	$("#btn-login").submit()	
})


</script>
</html>