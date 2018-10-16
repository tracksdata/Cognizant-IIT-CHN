
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

<h1>Employee Data_v1</h1>

<table border=1>
<tr>
	<th>Employee Id</th>
	<th>Employee Name</th>
	<th>Salary</th>
</tr>

<tr>
	
	<td><jsp:getProperty property="empId" name="emp"/> </td>
	<td><jsp:getProperty property="empName" name="emp"/></td>
	<td><jsp:getProperty property="salary" name="emp"/></td>
</tr>
</table>

</body>
</html>