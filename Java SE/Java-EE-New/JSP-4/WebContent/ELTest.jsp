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

application.setAttribute("name", "A-Praveen");

%>

<h1>EL test</h1>

<h1>Request:  ${requestScope.name} </h1>
<h1>Session: ${sessionScope.name} </h1>
<h1>Application: ${applicationScope.name }</h1>
<hr/>

<h1>Data: ${name}</h1>



</body>
</html>