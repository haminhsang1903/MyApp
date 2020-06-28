<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	List Student
		<ul>
			<li>${student.name}</li>
		</ul>
		<table>
		<tr>
			<th>Name</th>
			<th>Mark</th>
			<th>Major</th>
		</tr>
		<tr th:each="student : ${listStudent}">
			<td th:text="${student.name}"></td>
			<td th:text="${student.mark}"></td>
			<td th:text="${student.major}"></td>
			
		</tr>
	</table>
</body>
</html>