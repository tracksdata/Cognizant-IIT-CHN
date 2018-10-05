<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ include file="header.jsp"%>
<html>
<head>
<style type="text/css">
/*<![CDATA[*/
body.c16 {
	background-color: rgb(206, 206, 206);
}

table.c15 {
	background-color: rgb(0, 0, 160);
	width: 100%;
	text-align: left;
	margin-left: auto;
	margin-right: auto;
}

td.c14 {
	background-color: rgb(255, 255, 255);
}

table.c13 {
	width: 100px;
	text-align: left;
	margin-left: auto;
	margin-right: auto;
}

img.c12 {
	width: 125px;
	height: 31px;
}

img.c11 {
	border: 0px solid;
	width: 125px;
	height: 31px;
}

img.c50 {
	border: 0px solid;
	width: 125px;
	height: 31px;
}

form.c10 {
	background-color: rgb(204, 204, 255);
}

table.c9 {
	text-align: left;
	width: 100%;
	background-color: rgb(204, 204, 255)
}

table.c50 {
	text-align: left;
	width: 50%;
	background-color: rgb(204, 204, 255)
}

table.c51 {
	text-align: left;
	width: 5%;
	background-color: rgb(204, 204, 255)
}

img.c51 {
	border: 0px solid;
	width: 77px;
	height: 22px;
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

p.c5 {
	text-align: right
}

span.c4 {
	color: #c0c0c0;
	font-size: 80%
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
	width: 426px;
	height: 50px;
	background-color: rgb(204, 204, 255)
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
						<h2>My Order</h2>

						<h4>This is your Order. Kindly note down the <b>Order</b> ID for all future references</h4>


						<table class="c1" border="1" cellpadding="2" cellspacing="2">
							<tbody>
								<tr>
									<td>User Name:</td>
									<td><s:property value="userAccount.UserName" /></td>
								</tr>

								<tr>
									<td>User ID:</td>
									<td><s:property value="userAccount.Id" /></td>
								</tr>

								<tr>
									<td>Order ID:</td>
									<td><s:property value="order.Id" /></td>
								</tr>

								<tr>
									<td>Order Date:</td>
									<td><s:property value="order.Date" /></td>
								</tr>
							</tbody>
						</table>
						<br />

						<table class="c9" border="2" cellpadding="2" cellspacing="0">
							<tbody>
								<tr>
									<td>Product / Item</td>

									<td>In Stock?</td>

									<td>Cost</td>

									<td>Quantity</td>

									<td>Total</td>
								</tr>
								<tr>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
								<s:push value="cart.items">
									<s:iterator value="cart.items">

										<tr>
											<td><s:property value="name" /></td>

											<td>Yes</td>

											<td><s:property value="price" /></td>

											<td>1</td>

											<td><s:property value="price" /></td>
										</tr>
									</s:iterator>
								</s:push>

								<s:push value="cart.products">
									<s:iterator value="cart.products">
										<tr>
											<td><s:property value="product.name" /></td>

											<td><s:if test="%{product.cost > 0}">
                                    Yes
                                </s:if> <s:else>
                                    No
                                </s:else></td>

											<td><s:property value="product.cost" /></td>

											<td><s:property value="quantity" /></td>

											<td><s:property value="product.cost * quantity" /></td>
										</tr>
									</s:iterator>
								</s:push>
								<tr>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
								<tr>
									<td>Grand Total (USD) = <s:property value="cart.ItemTotal" />
									</td>
								</tr>
							</tbody>
						</table>
						<br />

						<table class="c50" border="1" cellpadding="2" cellspacing="2">
							<tbody>
								<tr>
									<td nowrap="nowrap"><span class="Caption">Shipping
									address:</span></td>
									<td align="left"><s:property
										value="order.IShippingAddress.Address" /></td>
								</tr>

								<tr>
									<td><span class="Caption">Phone Number:</span></td>
									<td align="left"><s:property
										value="order.IShippingAddress.phoneNumber" /></td>
								</tr>

								<tr>
									<td><span class="Caption">City:</span></td>
									<td align="left"><s:property
										value="order.IShippingAddress.city" /></td>
								</tr>

								<tr>
									<td><span class="Caption">State:</span></td>
									<td align="left"><s:property
										value="order.IShippingAddress.state" /></td>
								</tr>

								<tr>
									<td><span class="Caption">Zip:</span></td>
									<td align="left"><s:property
										value="order.IShippingAddress.zip" /></td>
								</tr>

								<tr>
									<td colspan="2">&#160;</td>
								</tr>

								<tr>
									<td><span class="Caption">Card Type:</span></td>
									<td align="left"><s:property
										value="order.ICreditCard.CardType" /></td>
								</tr>

								<tr>
									<td><span class="Caption">Card Number:</span></td>
									<td align="left"><s:property
										value="order.ICreditCard.CreditCardNumber" /></td>
								</tr>

								<tr>
									<td><span class="Caption">Expiry Date:</span></td>
									<td align="left"><!--s:property value="order.ICreditCard.ExpiryDate"/-->
									<s:date name="order.ICreditCard.ExpiryDate" format="dd/MM/yyyy" />
									</td>
								</tr>
							</tbody>
						</table>

						<br />

						<table class="c51" border="1" cellpadding="2" cellspacing="2">
							<tbody>
								<tr>
									<td><a href="<s:url action="clearCartAndOrder"/>"> <img
										class="c51" alt="" src="images/home.gif" /> </a></td>
								</tr>
							</tbody>
						</table>
						<br />
						<br />
						</td>
					</tr>

				</tbody>
			</table>
			<br />
			<br />
			</td>
		</tr>
	</tbody>
</table>
</body>
</html>