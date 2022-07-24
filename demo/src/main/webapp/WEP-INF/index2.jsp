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
	<h1>First Assignment </h1>
	
	<h4>ItemName <c:out value="${ itemName }" /></h4>
	<h4>price <c:out value="${ price }" /></h4>
	<h4>description <c:out value="${ description }" /></h4>
	<h4>vendor <c:out value="${ vendor }" /></h4>
	
	

 	
 	<script src="/main.js" type="text/javascript" ></script>
</body>
</html>