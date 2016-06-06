<%@ page import="smart.capacitacion.modelo.CarritoCompras" %>
<!DOCTYPE HTML>
<html>
<head>
	<style>
		body {
			font-family: sans-serif;
			}
		table {
				display: table-cell;
				display: inline;
				padding: 10px;
				font-family: sans-serif;
				color:white;
			}
		td, th {
				border: 1px solid black;
				text-align: center;
				background-color: teal;
			}
		ul li {
			display: inline;
			padding: 5px 10px 5px 10px;
			}
		ul {
			background-color: teal;
			color:white;
			margin: 10px 10px 0px 10px;
			list-style-type: none;
			padding: 5px 0px 5px 0px;
			border-bottom-left-radius: 13px;
			border-bottom-right-radius: 13px;
			}
		header{
			background-image: url("../img/pared.jpg");
			background-repeat: repeat-x;
			background-position: right;
			background-color: navy;
			margin: 10px 10px 0px 10px;
			height: 175px;
			color: white;
			border-top-left-radius: 13px;
			border-top-right-radius: 13px;
			}
		h1 {
			margin: 10px;
			padding: 30px;
			text-align: center;
			font-family: sans-serif;
			font-size: 75px;
			}
		section {
			padding: 15px;
			margin: 5px;
			}
		img {
			width: 235px;
			height: 235px;
			}
	</style>
	<meta charset="utf-8">
	<title>catalogo de productos</title>
</head>
<body>
	<header>
		<h1>CATALOGO DE PRODUCTOS</h1>
	</header>
	<nav>
		<ul>
			<li>Home</li>
			<li>Catalogo</li>
			<%CarritoCompras carritoCompras = (CarritoCompras)(session.getAttribute("carritoCompras"));  %>
			<li><a href="../ProductoServlet">Carrito de Compras (<%= carritoCompras.getProductosEnCarrito().size() %>)Productos</a></li>
			<li>Mi cuenta</li>
		</ul>
	</nav>
	<p>
		
	</p>
	<section>
	<table>
		<form name ="agregarProductoAlCarrito" action ="../ProductoServlet" method="post">
			<tr>
				<td>
					<img src="../img/converse.jpg" alt = "tenis converse">
				</td>
			</tr>
			<tr>
				<td>
					Tenis Converse
				</td>
			</tr>
			<tr>
				<td>
					$800
				</td>
			</tr>
			<tr>
				<td>
					<input type="hidden" name="idProducto" id= "idProducto" value="1">
					<input type= "submit" name = "producto" id = "producto" value= "Agregar">
				</td>
			</tr>
		</form>
	</table>
	<table>
		<form name ="agregarProductoAlCarrito" action ="../ProductoServlet" method="post">
			<tr>
				<td>
					<img src = "../img/Bicicleta.jpg" alt = "bicicleta">
				</td>
			</tr>
			<tr>
				<td>
					Bicicleta
				</td>
			</tr>
			<tr>
				<td>
					$10,000
				</td>
			</tr>
			<tr>
				<td>
					<input type="hidden" name="idProducto" id= "idProducto" value="2">
					<input type= "submit" name = "producto" id = "producto" value= "Agregar">
				</td>
			</tr>
		</form>
	</table>
	<table>
		<form name ="agregarProductoAlCarrito" action ="../ProductoServlet" method="post">
			<tr>
				<td>
					<img src = "../img/gameBoy.jpg" alt= "gameBoy">
				</td>
			</tr>
			<tr>
				<td>
					Game boy
				</td>
			</tr>
			<tr>
				<td>
					$5000
				</td>
			</tr>
			<tr>
				<td>
					<input type="hidden" name="idProducto" id= "idProducto" value="3">
					<input type= "submit" name = "producto" id = "producto" value= "Agregar">
				</td>
			</tr>
			</form>
	</table>
	<table>
		<form name ="agregarProductoAlCarrito" action ="../ProductoServlet" method="post">
			<tr>
				<td>
					<img src = "../img/espada.jpg" alt= "espada">
				</td>
			</tr>
			<tr>
				<td>
					Espada
				</td>
			</tr>
			<tr>
				<td>
					$18,000
				</td>
			</tr>
			<tr>
				<td>
					<input type="hidden" name="idProducto" id= "idProducto" value="4">
					<input type= "submit" name = "producto" id = "producto" value= "Agregar">
				</td>
			</tr>
		</form>
	</table>
	<table>
		<form name ="agregarProductoAlCarrito" action ="../ProductoServlet" method="post">
			<tr>
				<td>
					<img src = "../img/casco.jpg" alt= "casco">
				</td>
			</tr>
			<tr>
				<td>
					Casco
				</td>
			</tr>
			<tr>
				<td>
					$900
				</td>
			</tr>
			<tr>
				<td>
					<input type="hidden" name="idProducto" id= "idProducto" value="5">
					<input type= "submit" name = "producto" id = "producto" value= "Agregar">
				</td>
			</tr>
		</form>
	</table>
	<table>
		<form name ="agregarProductoAlCarrito" action ="../ProductoServlet" method="post">
			<tr>
				<td>
					<img src = "../img/jabon.jpg" alt= "jabon">
				</td>
			</tr>
			<tr>
				<td>
					Jabon
				</td>
			</tr>
			<tr>
				<td>
					$15
				</td>
			</tr>
			<tr>
				<td>
					<input type="hidden" name="idProducto" id= "idProducto" value="6">
					<input type= "submit" name = "producto" id = "producto" value= "Agregar">
				</td>
			</tr>
		</form>
	</table>
	<table>
		<form name ="agregarProductoAlCarrito" action ="../ProductoServlet" method="post">
			<tr>
				<td>
					<img src = "../img/botella_color.jpg" alt= "botella_color">
				</td>
			</tr>
			<tr>
				<td>
					Botella de color
				</td>
			</tr>
			<tr>
				<td>
					$20
				</td>
			</tr>
			<tr>
				<td>
					<input type="hidden" name="idProducto" id= "idProducto" value="7">
					<input type= "submit" name = "producto" id = "producto" value= "Agregar">
				</td>
			</tr>
		</form>
	</table>
	<table>
		<form name ="agregarProductoAlCarrito" action ="../ProductoServlet" method="post">
			<tr>
				<td>
					<img src = "../img/millenium_falcon.jpg" alt= "millenium_falcon">
				</td>
			</tr>
			<tr>
				<td>
					Millenium Falcon
				</td>
			</tr>
			<tr>
				<td>
					$900,000
				</td>
			</tr>
			<tr>
				<td>
					<input type="hidden" name="idProducto" id= "idProducto" value="8">
					<input type= "submit" name = "producto" id = "producto" value= "Agregar">
				</td>
			</tr>
		</form>
	</table>
	<table>
		<form name ="agregarProductoAlCarrito" action ="../ProductoServlet" method="post">
			<tr>
				<td>
					<img src = "../img/at-at.jpg" alt= "at-at">
				</td>
			</tr>
			<tr>
				<td>
					Mascota AT-AT
				</td>
			</tr>
			<tr>
				<td>
					$3000
				</td>
			</tr>
			<tr>
				<td>
					<input type="hidden" name="idProducto" id= "idProducto" value="9">
					<input type= "submit" name = "producto" id = "producto" value= "Agregar">
				</td>
			</tr>
		</form>
	</table>
	<table>
		<form name ="agregarProductoAlCarrito" action ="../ProductoServlet" method="post">
			<tr>
				<td>
					<img src = "../img/mustang.jpg" alt= "mustang">
				</td>
			</tr>
			<tr>
				<td>
					Mustang
				</td>
			</tr>
			<tr>
				<td>
					$800,000
				</td>
			</tr>
			<tr>
				<td>
					<input type="hidden" name="idProducto" id= "idProducto" value="10">
					<input type= "submit" name = "producto" id = "producto" value= "Agregar">
				</td>
			</tr>
		</form>
	</table>
	</section>
</body>
</html>