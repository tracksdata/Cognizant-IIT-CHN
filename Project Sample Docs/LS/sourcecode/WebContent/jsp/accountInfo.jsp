<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ include file="header.jsp"%>
<html>
<head>
<style type="text/css">
/*<![CDATA[*/
table.c100 {
	background-color: rgb(204, 204, 255);
}

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

img.c11 {
	border: 0px solid;
	width: 77px;
	height: 22px;
}

span.c1 {
	text-decoration: underline;
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
						<h2>Your Account at WebStore</h2>

						<table class="c100 " border="1" cellpadding="2" cellspacing="2"
							width="50%">
							<tbody>
								<tr>
									<td><span class="Caption">User Name</span></td>

									<td align="left"><s:property value="userAccount.userName" />
									</td>
								</tr>

								<tr>
									<td><span class="Caption">Password</span></td>

									<td align="left"><s:property value="userAccount.password" />
									</td>
								</tr>

								<tr>
									<td colspan="2">&#160;</td>
								</tr>

								<tr>
									<td><span class="Caption">First name</span></td>

									<td align="left"><s:property value="userAccount.firstName" />
									</td>
								</tr>

								<tr>
									<td><span class="Caption">Last name</span></td>

									<td align="left"><s:property value="userAccount.lastName" />
									</td>
								</tr>

								<tr>
									<td colspan="2">&#160;</td>
								</tr>

								<tr>
									<td><span class="Caption">Date Of Birth</span></td>

									<td align="left"><s:property value="userAccount.birthDate" />
									</td>
								</tr>

								<tr>
									<td><span class="Caption">Email-Address</span></td>

									<td align="left"><s:property value="userAccount.emailID" />
									</td>
								</tr>

								<tr>
									<td colspan="2">&#160;</td>
								</tr>

								<tr>
									<td nowrap="nowrap"><span class="Caption">Mailing
									address</span></td>

									<td align="left"><s:property
										value="userAccount.IAddress.Address" /></td>
								</tr>

								<tr>
									<td><span class="Caption">Phone Number</span></td>

									<td align="left"><s:property
										value="userAccount.IAddress.phoneNumber" /></td>
								</tr>

								<tr>
									<td><span class="Caption">City</span></td>

									<td align="left"><s:property
										value="userAccount.IAddress.city" /></td>
								</tr>

								<tr>
									<td><span class="Caption">State</span></td>

									<td align="left"><s:property
										value="userAccount.IAddress.state" /></td>
								</tr>

								<tr>
									<td><span class="Caption">Zip</span></td>

									<td align="left"><s:property
										value="userAccount.IAddress.zip" /></td>
								</tr>

								<tr>
									<td><span class="Caption">Country</span></td>

									<td align="left"><s:property
										value="userAccount.IAddress.country" /></td>
								</tr>
								<tr>
									<td colspan="2">&#160;</td>
								</tr>

							</tbody>
						</table>
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