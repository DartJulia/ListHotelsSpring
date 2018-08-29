<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hotel Search</title>
<link rel="stylesheet"
	href="https://bootswatch.com/4/minty/bootstrap.min.css" />
</head>
<body>
	<div class="jumbotron">
		<h1 class="display-3">Hotel Search</h1>
		<p class="lead">Select a city to see the hotels in the
			area!</p>
		<hr class="my-4">
		<p class="lead"></p>
		<form action="/hotels" method="post">
		<select name="city" class="custom-select" style="width:40%">
		<option value="">Select a city..</option>
			<c:forEach var="c" items="${cities}">
				<option value="${c}">${c}</option>
			</c:forEach>
		</select>
		<button type="submit" class="btn btn-secondary">Search</button>
	</form>
	</div>



</body>
</html>