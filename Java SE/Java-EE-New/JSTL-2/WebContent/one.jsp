<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>


<%

String cities[]={"Chennai","Hyd","Pune","bangalore","Delhi"};

request.setAttribute("cities", cities);

List<String> names=new ArrayList<>();

names.add("Praveen");
names.add("Ozvitha");
names.add("James");
names.add("Sarah");
names.add("Rose");

request.setAttribute("employeeNames", names);

%>

<jsp:forward page="/two.jsp"/>