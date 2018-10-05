<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ include file="header.jsp"%>
<html>
<head>
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

td.c50 {
	width: 400px;
	vertical-align: middle;
	white-space: nowrap;
	text-align: center;
	font-size: 200%
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
<style type="text/css">
/*<![CDATA[*/
table.c5 {
	text-align: left;
	width: 100px;
}

table.c4 {
	background-color: rgb(204, 204, 204);
	text-align: left;
	margin-left: auto;
	margin-right: 2px;
	width: 600px;
	height: 300px;
}

img.c3 {
	width: 84px;
	height: 24px;
}

td.c2 {
	width: 100px;
	vertical-align: middle;
	white-space: nowrap;
	text-align: center;
}

img.c1 {
	width: 15px;
	height: 15px;
}
/*]]>*/
</style>
<style type="text/css">
/*<![CDATA[*/
table.c6 {
	background-color: rgb(204, 204, 204);
	width: 300px;
	text-align: left;
	margin-left: auto;
	margin-right: auto;
}

img.c5 {
	width: 15px;
	height: 15px;
}

table.c4 {
	text-align: left;
	width: 100px;
}

img.c3 {
	width: 84px;
	height: 24px;
}

span.c2 {
	color: rgb(255, 255, 255);
}

a.c1 {
	color: rgb(255, 255, 255);
}
/*]]>*/
</style>
</head>
<body>
<table>
	<tbody>
		<tr>
			<td bgcolor="#ffffff">
			<table align="center" border="0" cellpadding="8" cellspacing="0"
				width="100%">
				<tbody>
					<tr>
						<td valign="top" width="100">
						<table align="center" bgcolor="#8080FF" border="0" cellpadding="6"
							cellspacing="1" width="100">
							<tbody>
								<tr>
									<td>
									<p class="c8"><img class="c11" alt=""
										src="images/copyright.jpg" /></p>
									</td>
								</tr>
							</tbody>

						</table>
						</td>
						<td>
						<table class="c6" border="1" cellpadding="2" cellspacing="2">
							<tbody>
								<s:iterator value="item">
									<tr>
										<td>
										<table class="c4" border="2" cellpadding="2" cellspacing="2">
											<tbody>
												<tr>
													<td class="c50"><s:property value="top.name" /></td>
												</tr>

												<tr>
													<td><s:property value="top.description" /></td>
												</tr>

												<tr>
													<td><s:property value="top.cost" /></td>
												</tr>

												<tr>
													<td><br>
													$<s:property value="top.price" /> <a
														href="<s:url action="addItemToCart">
                                    <s:param name="id" value="top.id"/></s:url>">

													<img class="c3" alt="" border="0"
														src="images/addToCart.gif" /> </a></td>
												</tr>
											</tbody>
										</table>
										</td>

										<td><s:iterator value="images.images">
											<img border="0" alt="" src="<s:property value="path"/>" />
										</s:iterator></td>
									</tr>
								</s:iterator>
							</tbody>
						</table>
						<br />
						</td>
					</tr>
				</tbody>
			</table>
			</td>
		</tr>
	</tbody>
</table>
<br />
</body>
</html>