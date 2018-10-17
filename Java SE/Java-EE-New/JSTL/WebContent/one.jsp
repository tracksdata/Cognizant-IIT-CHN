<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"  %>

<h1>
<c:out value="Hello JSTL"/> <br/>
</h1>

<c:set value="Praveen" var="name"/>
<h1>Name is  ${name}</h1>
<h1>


<c:forEach var="i" begin="1"  end="10" step="1" >
${i} 
</c:forEach>

</h1>
