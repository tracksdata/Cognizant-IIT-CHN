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
table.c3 {
	background-color: rgb(204, 204, 204);
	width: 100px;
	text-align: left;
	margin-left: auto;
	margin-right: auto;
}

table.c2 {
	text-align: left;
	width: 417px;
	height: 100px;
}

img.c1 {
	width: 15px;
	height: 15px;
}
/*]]>*/
</style>
<style type="text/css">
/*<![CDATA[*/
td.c1 {
	font-size: 144%
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
						<table class="c3" border="1" cellpadding="2" cellspacing="2">
							<tbody>
								<s:iterator value="categories">
									<tr>
										<s:iterator value="images.images">
											<td><a
												href="<s:url action="getSubCategoryOrProduct"><s:param name="id" value="[1].id"/></s:url>">
											<img border="0" alt="" src="<s:property value="path"/>" /> </a></td>
										</s:iterator>
										<td>
										<table class="c2" border="1" cellpadding="2" cellspacing="2">
											<tbody>
												<tr>
													<td class="c1"><a
														href="<s:url action="getSubCategoryOrProduct">
                        <s:param name="id" value="top.id"/></s:url>">
													<s:property value="top.name" /> </a></td>

												</tr>

												<tr>
													<td><s:property value="top.description" /></td>
												</tr>
											</tbody>
										</table>
										</td>
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
</body>
</html>