<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="banner.jsp"/>
<hr/>
<jsp:include page="menu.jsp"/>


<form action="process_v1.jsp">
Employee Id: <input type="text" name="empId"><br>
Employee Name: <input type="text" name="empName"><br>
Salary: <input type="text" name="salary"><br>
<input type="submit" value="Display">


</form>

</body>
</html>