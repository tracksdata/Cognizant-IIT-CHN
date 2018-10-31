<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form action="" modelAttribute="product">
Product Id: <form:input path="prodId"/> <br/>
Product Name: <form:input path="prodName"/> <br/>
Price: <form:input path="price"/> <br/>
Select Branch:
<form:select path="branchName">
<form:options items="${branches}"/>
</form:select> <br/>
Check:
<form:checkboxes items="${branches}" path="branchName"/> <br/>
Select One:

<form:radiobuttons path="branchName" items="${branches}"/> <br/>

<button>Update</button>

</form:form>

</body>
</html>