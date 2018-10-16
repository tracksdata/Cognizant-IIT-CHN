
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp" class="com.Employee" scope="request"/>

<jsp:include page="banner.jsp"/>
<hr/>
<jsp:include page="menu.jsp"/>

<h1>Employee Data_v1</h1>

<table border=1 align="centers">
<tr>
	<th>Employee Id</th>
	<th>Employee Name</th>
	<th>Salary</th>
</tr>

<tr>
	
	<td>${requestScope.emp.empId}</td>
	<td>${emp.empName }</td>
	<td>${emp.salary}</td>
</tr>
</table>

</body>
</html>