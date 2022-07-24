<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>hello world</title>
	<script type="text/javascript" src="/js/app.js"></script>
	<link href="/style.css" rel="stylesheet" >
	
</head>
<body>
	<h1>Hello world, with some style!</h1>
 	<h1 class=text-primary> <c:out value="${fname}"/> </h1>
 	
 	<c:forEach var="i" items="${clasof}">
 	<h5>
 	<c:out value="${i}"/>
 	</h5>
 	</c:forEach>
 	
 	<script src="/main.js" type="text/javascript" ></script>
</body>
</html>