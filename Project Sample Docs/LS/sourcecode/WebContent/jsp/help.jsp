<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ include file="header.jsp"%>
<html>
<head>
<style type="text/css">
/*<![CDATA[*/
body.c10 {
	background-color: rgb(206, 206, 206);
}

h3.c9 {
	text-align: center
}

p.c8 {
	text-align: center
}

h1.c7 {
	color: #000000;
	text-align: center
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

						<td><br />
						<br />

						<s:if test="#session.userAccount == null">

							<h2 class="c9">How to Sign in or Create Your Account at
							WebStore?</h2>

							<p><span class="TextTiny"><br />
							To get started, simply click the <b>"Sign-In"</b> link&#160;found
							in the upper right-hand corner of every page. You'll be taken to
							a page called Sign-In. If you've already created a WebStore
							account, follow the directions under <b>"Already have an
							account?"</b><br />
							<br />
							If you need to create an account, click the <b>"Create an
							Account"</b> link under <b>"Need to create an account?"</b> and then
							fill out the quick form on the next page.</span></p>
						</s:if> <s:if test="#session.userAccount != null">
							<h2 class="c9">How to purchase/order products at WebStore?</h2>
							<p><span class="TextTiny"><br />
							To purchase Products, select(click on) the type of product you
							want to purchase from the list of <b>Catalogs</b> displayed in <b>Home</b>
							page. All the products under that type will be displayed along
							with images and description. <br />
							<br />
							select the product you want to purchase and the selected product
							will be displayed with image, description and price. If you want
							to purchase the selected product add that product to <b>Cart</b>
							by clicking on <b>Add to Cart</b> icon. <br />
							<br />
							If you want to change the quantity of added product, you can do
							so by changing the value in <b>Quantity</b> field provided in <b>Cart</b>
							page. After changing the quantity update the Cart by clicking on
							<b>Update</b> and You can also remove the products from <b>Cart</b>
							by clicking on <b>remove</b>. <br />
							<br />
							Click on <b>Checkout</b> icon to order the products you have
							purchased and You will be navigated to Billing page. Enter all
							the details in the Billing page and click on <b>Continue</b>. You
							will be provided with your order detals and an <b>OrderID</b>.
							you can use this OrderID to track your order. </span></p>
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