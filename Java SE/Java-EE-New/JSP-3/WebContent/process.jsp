<%@page import="com.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
int empId=Integer.parseInt(request.getParameter("empId"));
String empName=request.getParameter("empName");
double salary=Double.parseDouble(request.getParameter("salary"));
Employee emp=new Employee();
emp.setEmpId(empId);
emp.setEmpName(empName);
emp.setSalary(salary);

request.setAttribute("employee", emp);
RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
rd.forward(request, response);


%>

</body>
</html>