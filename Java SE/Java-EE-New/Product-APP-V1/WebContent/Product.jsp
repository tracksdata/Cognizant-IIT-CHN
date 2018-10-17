<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<jsp:include page="/Banner.jsp"/>
<jsp:include page="/Menu.jsp"/>

<div>
<h2>${param.msg}</h2>
</div>



<table rowspacing="5" cellspacing="5" align="center">


<tr>
	<td>Product Id</td>
	<td>Product Name</td>
	<td>Price</td>
	<td>Description</td>
	
</tr>


	<tr>
	
		<td> ${product.id} </td>
		<td> ${product.name} </td>
		<td> ${product.price} </td>
		<td> ${product.description} </td>
		
	</tr>



</table>





</body>
</html>