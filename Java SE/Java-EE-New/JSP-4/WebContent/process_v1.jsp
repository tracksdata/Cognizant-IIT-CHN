
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
<jsp:setProperty property="*" name="emp"/>
<jsp:forward page="display_v1.jsp"/>

</body>
</html>