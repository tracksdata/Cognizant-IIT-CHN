<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ include file="header.jsp"%>
<html>
<head>
<style type="text/css">
/*<![CDATA[*/
body.c15 {
	background-color: rgb(206, 206, 206);
}

table.c14 {
	text-align: left;
	width: 555px;
	height: 118px;
}

table.c13 {
	text-align: left;
	width: 472px;
	height: 120px;
}

th.c12 {
	white-space: nowrap;
}

th.c11 {
	background-color: rgb(204, 204, 255);
}

span.c10 {
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
						<h2><span class="Caption c10">Already have an account?</span></h2>

						<p><span class="TextTiny">Your Account is where you
						gain convenient and secure access to all your information, keep
						track of the products you're planning to purchase, and more.
						Enjoy!</span></p>

						<table class="c14" border="1" cellpadding="2" cellspacing="2">
							<tbody>
								<tr>
									<th class="c11"><span class="Caption c10">Already
									have an account?</span></th>
								</tr>

								<tr>
									<td><span class="TextTiny">Please enter your user
									name and password.</span></td>
								</tr>

								<tr>
									<td><br />

									<form name="log_in" action="login.action" method="post">
									<table class="c13" border="0" cellpadding="2" cellspacing="2">
										<tbody>
											<tr>
												<th><span class="Caption">User Name</span></th>

												<td><input name="userName" maxlength="20" size="20"
													value="" type="text" /></td>
											</tr>

											<tr>
												<th><span class="Caption">Password</span></th>

												<td><input name="password" maxlength="20" size="20"
													value="" type="password" /></td>
											</tr>

											<tr>
												<th></th>
												<th><input type="submit" value="Login" name="submit.x"
													align="middle" /></th>
											</tr>
										</tbody>
									</table>
									<br />
									</form>
									</td>
								</tr>
							</tbody>
						</table>

						<h2><br />
						</h2>

						<h2><span class="Caption c10">Need to create an
						account?</span></h2>

						<p><span class="TextTiny">Creating an account at
						WebStore is convenient, secure and free.</span></p>

						<p><strong>&#160;<br />
						<big> <a
							href="<s:url action="showRegistrationForm">
                        </s:url>">
						Create an account now</a> </big></strong></p>

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