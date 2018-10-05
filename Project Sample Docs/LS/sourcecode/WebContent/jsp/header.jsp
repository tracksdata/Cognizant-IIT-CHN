<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title></title>
<style type="text/css">
/*<![CDATA[*/
body.c17 {
	background-color: rgb(206, 206, 206);
}

table.c16 {
	background-color: rgb(0, 0, 160);
	width: 100%;
	text-align: left;
	margin-left: auto;
	margin-right: 0px;
}

table.c15 {
	background-color: rgb(204, 204, 204);
	text-align: left;
	margin-left: auto;
	margin-right: auto;
	height: 167px;
	width: 525px;
}

table.c14 {
	text-align: left;
	height: 63px;
	width: 227px;
}

td.c13 {
	background-color: rgb(204, 204, 255);
}

img.c12 {
	height: 19px;
	width: 36px;
}

img.c11 {
	width: 27px;
	height: 33px;
}

tr.c10 {
	color: rgb(255, 255, 255);
}

td.c9 {
	background-color: rgb(51, 102, 255);
	height: 20%;
}

p.c8 {
	text-align: center
}

h3.c7 {
	text-align: center
}

h1.c6 {
	text-align: center
}

td.c5 {
	text-align: right;
}

p.c4 {
	color: #c0c0c0;
	font-size: 80%;
	text-align: right
}

span.c3 {
	color: #ffffff
}

a.c2 {
	color: #ffffff
}

span.c1 {
	text-decoration: underline;
}
/*]]>*/
</style>
</head>
<body>
<table class="c16" border="0" cellpadding="3" cellspacing="0">
	<tbody>
		<tr>
			<td class="c5">
			<p class="c4"><s:if test="#session.userAccount != null">
				<span class="c3"> <s:property
					value="#session.userAccount.UserName" /> </span>
				<span class="c3">&#160; |&#160;</span>
			</s:if> <a class="navwhite c2" href="<s:url action="index"></s:url>"> <span
				class="c1">Home</span> </a> <s:if test="#session.userAccount != null">
				<span class="c3">&#160; |&#160;</span>
				<a class="navwhite c2"
					href="<s:url action="showUserAccount"></s:url>"> <span
					class="c1">My Account</span> </a>
			</s:if> <span class="c3">&#160; |&#160;</span> <a class="navwhite c2"
				href="<s:url action="showCart"></s:url>"> <span class="c1">Cart</span>
			</a> <span class="c3">&#160; |&#160;</span>&#160; <a class="navwhite c2"
				href="<s:url action="showHelp"></s:url>"> <span class="c1">Help</span>
			</a> <s:if test="#session.userAccount == null">
				<span class="c3">&#160; |&#160;</span>
				<a class="navwhite c2"
					href="<s:url action="showUserAccount"></s:url>"> <span
					class="c1">Sign-In</span> </a>
			</s:if> <s:else>
				<span class="c3">&#160; |&#160;</span>
				<a class="navwhite c2" href="<s:url action="signOut"></s:url>">
				<span class="c1">Sign-Out</span> </a>
			</s:else></p>
			</td>
		</tr>

		<tr>
			<td bgcolor="#8080FF"><br/-->
			<h1 class="c6">WebStore&#174;</h1>
			</td>
		</tr>
	</tbody>
</table>
</body>
</html>