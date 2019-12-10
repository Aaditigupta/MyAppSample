<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/Style.css">
<script type="text/javascript" src="/resources/js/Student.js"></script>
</head>
<body>
	<h1><center>User Details</center></h1>
	<div class="container">
	<div class="form">
		<form action="postData" method="post">
			<table>
				<tr>
					<td>Enter User ID</td>
					<td><input id="userId" name="userId"></td>
				</tr>
				<tr>
					<td>Enter User name</td>
					<td><input id="userName" name="userName"></td>
				</tr>
				<tr>
					<td>Enter User email</td>
					<td><input id="email" name="email"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit"></td>
				</tr>
			</table>
		</form>
		</div>
		<div class="delete-section">
		<form action="deletedata" method="post">
			<table>
				<tr>
					<td>Enter User ID</td>
					<td><input id="User_Id" name="userId"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Delete"></td>
				</tr>
			</table>
		</form>
	</div>
	</div>
</body>
</html>