<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="../common/js/index.js"></jsp:include>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
您已经登录
<form action="/demo/loginOut">
	<button id="btn-loginout" value="">登出</button>
</form>

</body>
<script type="text/javascript">
$(function(){
	$("#btn-loginout").submit()	
	
})

</script>
</html>