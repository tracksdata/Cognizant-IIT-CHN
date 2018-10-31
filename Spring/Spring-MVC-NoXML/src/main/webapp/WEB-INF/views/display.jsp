<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Display.jsp</h2> <hr/>
<h2>Name: ${name}</h2>

<table border="1">
	<tr>
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Price</th>
	</tr>
	
	<tr>
		<td>${product.prodId }</td>
		<td>${product.prodName }</td>
		<td>${product.price }</td>
	</tr>

</table>

<hr/>

<h2>Cities</h2>

<ul>
	
	<c:forEach items="${myCities}" var="city">
		<li>
		${city}
		</li>
	</c:forEach>
	
</ul>

</body>
</html>