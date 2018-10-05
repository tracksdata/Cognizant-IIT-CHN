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

form.c10 {
	background-color: rgb(204, 204, 255);
}

table.c9 {
	text-align: left;
	width: 100%;
	background-color: rgb(204, 204, 255);
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
						<h2>My Cart</h2>
						<s:if test="%{top.cart.ItemCount == 1}">
							<h3>You have <s:property value="top.cart.ItemCount" /> item
							in your Shopping Cart</h3>
						</s:if> <s:if test="%{top.cart.ItemCount > 1}">
							<h3>You have <s:property value="top.cart.ItemCount" />
							items in your Shopping Cart</h3>
						</s:if> <s:if test="%{top.cart.ItemCount > 0}">
                	To change the quantity edit the <b>Quantity</b> field and click on <b>Update
							Cart</b> button
                </s:if>


						<form class="c10" name="cart_form" action="updateCart.action"
							method="post">
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
											<td><a
												href="<s:url action="getItem">
                            <s:param name="id" value="top.id"/></s:url>">
											<s:property value="top.name" /> <s:property
												value="top.description" /> </a></td>

											<td>Yes</td>

											<td><s:property value="top.price" /></td>

											<td>1 <a
												href="<s:url action="removeItem">
                                <s:param name="id" value="top.id"/></s:url>">
											remove</a></td>

											<td><s:property value="top.price" /></td>
										</tr>
									</s:iterator>
								</s:push>

								<s:push value="cart.products">
									<s:iterator value="cart.products">
										<tr>
											<td><a
												href="<s:url action="getProduct">
                             <s:param name="id" value="top.product.id"/></s:url>">
											<s:property value="top.product.name" /> <s:property
												value="top.product.description" /> </a></td>

											<td><s:if test="%{top.product.cost > 0}">
                                    Yes
                                </s:if> <s:else>
                                    No
                                </s:else></td>

											<td><s:property value="top.product.cost" /></td>

											<td><input type="text"
												name="quantity<s:property value="top.product.id"/>"
												value=<s:property value="top.quantity"/> align="left"
												maxlength="1" size="1" /> <a
												href="<s:url action="removeProduct"> 
                                <s:param name="id" value="top.product.id"/></s:url>">
											<!--h5 align="right"-->remove<!--/h5--></a></td>

											<td><s:property value="top.product.cost * top.quantity" />
											</td>
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
									<td>Grand Total (USD) = <s:property
										value="top.cart.ItemTotal" /></td>
								</tr>
								<tr>
									<td><s:if test="%{top.cart.ItemCount >= 0}">
										<input type="submit" value="Update Cart" name="update.x"
											align="right" />
									</s:if></td>
									<td>
								</tr>
							</tbody>
						</table>
						<br />
						<br />
						<br />
						</form>
						</td>
					</tr>
				</tbody>
			</table>
			<br />

			<table class="c13" border="1" cellpadding="2" cellspacing="2">
				<tbody>
					<tr>
						<td><a href="<s:url action="index"/>"> <img class="c11"
							alt="" src="images/keepShopping.gif" /> </a></td>

						<td><s:if test="%{top.cart.ItemCount > 0}">
							<a href="<s:url action="showOrderDetails"/>"> <img
								class="c11" alt="" src="images/checkout.gif" />
							</a>
						</s:if></td>
					</tr>
				</tbody>
			</table>
			</td>
		</tr>
	</tbody>
</table>
</body>
</html>