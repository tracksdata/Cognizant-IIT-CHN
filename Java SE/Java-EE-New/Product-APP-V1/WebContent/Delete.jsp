<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"  %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/Banner.jsp"/>
<jsp:include page="/Menu.jsp"/>

<form action="ProductController?menu=delete" method="post">

<table align="center">

<tr>
	<th>Product Id</th>
	<td>
		<select name="id">
		
		<c:forEach var="prod" items="${prods}">
				<option> ${prod.id}</option>
		</c:forEach>
		</select>
	
	</td>
</tr>

<tr>
	<th colspan="2">
		<input type="submit" value="Delete">
	</th>
</tr>

</table>

</form>


</body>
</html>