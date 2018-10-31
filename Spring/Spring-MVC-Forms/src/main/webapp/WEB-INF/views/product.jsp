<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>    
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
function loadStates() {
	//alert('--test')
	document.getElementById("mf").action = "s5"; //Setting form action to "success.php" page
	document.getElementById("mf").submit();
}

</script>
</head>
<body>

<form:form action="" modelAttribute="product" id="mf">
Product Id: <form:input path="prodId"/> <br/>
Product Name: <form:input path="prodName"/> <br/>
Price: <form:input path="price"/> <br/>
Select Branch:
<form:select path="branchName">
<form:options items="${branches}"/>
</form:select> <br/>
Check:
<form:checkboxes items="${branches}" path="branchName"/> <br/>
Select One:

<form:radiobuttons path="branchName" items="${branches}"/> <br/>

<form:select multiple="single" path="itemType" id="itemType">
    <form:option value="0" label="Select" />
    <c:forEach var="itemGroup" items="${dataList}" varStatus="itemGroupIndex">
       <optgroup label="${itemGroup.key}">
           <form:options items="${itemGroup.value}"/>        
       </optgroup>
    </c:forEach>        
</form:select>
<br/>

<form:select path="countryName" onchange="javascript:loadStates()">

<form:options items="${countries}"/>
</form:select>
<br/>
<form:select path="stateName">

	<form:options items="${states}"/>
</form:select>

<button>Update</button>

</form:form>

</body>
</html>