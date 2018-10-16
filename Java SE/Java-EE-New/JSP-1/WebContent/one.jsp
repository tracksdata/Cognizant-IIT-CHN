<%@page import="java.util.*" %>
<h2>Welcome to my Server Programing</h2>
bla bla
<h1>Date: <%=new Date()%></h1>
<%
String s1="Praveen";
out.println("<h1>Hello "+s1);


%>

<%
out.println("<h1>Name is "+empName);
%>
<h1>Name: <%=getName() %> </h1>
<h1> Employee: <%=s1%> </h1>
<%!
String empName="Ozvitha";
public String getName(){
	return "James";
}
%>