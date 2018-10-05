<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ include file="header.jsp"%>
<html>
<head>
<link href="<s:url value="/css/main.css"/>" rel="stylesheet"
	type="text/css" />
<style type="text/css">
/*<![CDATA[*/
body.c11 {
	background-color: rgb(206, 206, 206);
}

input.c10 {
	color: rgb(0, 0, 0);
}

p.c9 {
	text-align: center
}

h1.c8 {
	color: #000000;
	text-align: center
}

td.c7 {
	text-align: right;
}

p.c6 {
	text-align: right
}

span.c5 {
	color: #c0c0c0;
	font-size: 80%
}

a.c4 {
	color: #ffffff
}

a.c3 {
	color: #c0c0c0;
	font-size: 80%
}

span.c2 {
	color: #ffffff
}

span.c1 {
	text-decoration: underline;
}
/*]]>*/
</style>
<style type="text/css">
/*<![CDATA[*/
table.c1 {
	text-align: left;
	width: 250px;
	height: 50px;
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
						<table class="c1" border="0" cellpadding="1" cellspacing="1">
							<tbody>
								<tr>
									<td>User Name:</td>

									<td><s:property value="userAccount.UserName" /></td>
								</tr>
							</tbody>
						</table>

						<form method="post" action="placeOrder.action">
						<table border="0" cellpadding="1" cellspacing="0" width="50%">
							<tbody>
								<tr>
									<td nowrap="nowrap"><span class="Caption">Shipping
									Address</span></td>

									<td align="left"><textarea name="address"></textarea></td>
								</tr>

								<tr>
									<td><span class="Caption">Phone Number</span></td>

									<td align="left"><input name="phoneNumber" maxlength="12"
										size="12" value="" type="text" /></td>
								</tr>

								<tr>
									<td><span class="Caption">City</span></td>

									<td align="left"><input name="city" maxlength="15"
										size="15" value="" type="text" /></td>
								</tr>

								<tr>
									<td><span class="Caption">State</span></td>

									<td align="left"><input name="state" maxlength="15"
										size="15" value="" type="text" /></td>
								</tr>

								<tr>
									<td><span class="Caption">Zip</span></td>

									<td align="left"><input name="zip" maxlength="8" size="8"
										value="" type="text" /></td>
								</tr>
								<tr>
									<td><span class="Caption">Country</span></td>

									<td align="left"><input name="country" maxlength="15"
										size="15" value="" type="text" /></td>
								</tr>
								<tr>
									<td colspan="2">&#160;</td>
								</tr>

								<tr>
									<td><span class="Caption">Card Type</span></td>

									<td align="left"><input name="cardType" maxlength="8"
										size="8" value="" type="text" /></td>
								</tr>

								<tr>
									<td><span class="Caption">Card Number</span></td>

									<td align="left"><input name="cardNumber" maxlength="16"
										size="16" value="" type="text" /></td>
								</tr>

								<tr>
									<td><span class="Caption">Expiry Date</span></td>

									<td align="left"><s:head /> <s:datetimepicker
										name="expiryDate" label="(dd-MM-yyyy)"
										displayFormat="dd-MM-yyyy" /></td>
								</tr>

								<tr>
									<td colspan="2" align="center"><input class="Caption c10"
										value="Continue &gt;&gt;" id="pushed" name="pushed"
										type="submit" /></td>
								</tr>
							</tbody>
						</table>
						</form>
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