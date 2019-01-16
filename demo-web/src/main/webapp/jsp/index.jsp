<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<jsp:include page="../common/js/index.js"></jsp:include>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
我的首页
<button id="query">查询我的信息</button>
	<c:forEach var="user" items="${user1 }"  varStatus="">
		<p>${user}</p>
	</c:forEach> 
	<c:forEach var="user" items="${user }"  varStatus="">
		<p>${user}</p>
	</c:forEach> 

</body>
</html>