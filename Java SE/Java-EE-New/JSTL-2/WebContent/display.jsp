<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>


<table border=0 cellspacing="10" rowspacing="10">

<tr bgcolor="skyblue">
	<th>Employee Id</th>
	<th>Employee Name</th>
	<th>Salary</th>

</tr>

<c:forEach var="emp" items="${employees}">

<tr>
	<td> ${emp.empId} </td>
	<td> ${emp.empName} </td>
	<td> ${emp.salary} </td>
</tr>

</c:forEach>

</table>