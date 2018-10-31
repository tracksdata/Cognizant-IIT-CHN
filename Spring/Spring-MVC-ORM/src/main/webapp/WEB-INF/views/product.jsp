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

<form action="saveProduct" method="post">
Id: <input name="prodId"/> <br/>
Name: <input name="prodName"/> <br/>
Price: <input name="price"/> <br/>
<button type="submit">Save Product</button>
</form>
<hr/>
<p>
${msg}
</p>

</body>
</html>