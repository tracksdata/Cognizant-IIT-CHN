<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<ul>

	<c:forEach items="${requestScope.cities}" var="cityName">

		<li>${cityName}</li>

	</c:forEach>

</ul>

<table border=1>
	<tr>
		<th>Sno</th>
		<th>Name</th>
	</tr>


	<c:forEach var="empName" items="${employeeNames}" varStatus="cnt">
		<tr>
			<td> ${cnt.count}</td>
			<td>${empName}</td>
		</tr>	
	</c:forEach>




</table>