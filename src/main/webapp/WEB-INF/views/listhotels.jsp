<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>City Results</title>
<link rel="stylesheet"
	href="https://bootswatch.com/4/minty/bootstrap.min.css" />
</head>
<body>
	<div class="jumbotron">
		<h1 class="display-3">Hotels in ${city}</h1>
		<p class="lead"></p>
		<hr class="my-4">
		<p class="lead">
			<c:forEach var="hotel" items="${list}">
				<h2 style="color: #F3969A">${hotel.name}</h2>
				<p>Price: $${hotel.price}</p>
			</c:forEach>
			
			<br>
			<br>
<a href="/">Back to Search</a>
		</p>

</body>
</html>