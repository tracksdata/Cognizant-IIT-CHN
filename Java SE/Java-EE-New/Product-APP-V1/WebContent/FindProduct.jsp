<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/Banner.jsp"/>
<jsp:include page="/Menu.jsp"/>

<form action="ProductController?menu=find&operation=update" method="post">

<table align="center">

<tr>
	<th>Product Id</th>
	<td><input type="text" name="id">
</tr>
<tr>
	<th colspan="2">
		${param.msg}
	</th>
</tr>
<tr>
	<th colspan="2">
		<input type="submit" value="Find">
	</th>
</tr>

</table>

</form>


</body>
</html>