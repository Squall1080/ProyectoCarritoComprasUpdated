package smart.utilerias;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import smart.modelo.CarritoCompras;
import smart.modelo.Producto;
import smart.web.UsuarioController;

public class Main {

	private static int select;

	public static void main2(String arg[]) {
		Scanner leer = new Scanner(System.in);
		Scanner leer2 = new Scanner(System.in);
		Producto producto1 = new Producto();
		producto1.setNombreProducto("nombreProducto1");
		
		CarritoCompras carritoCompras = new CarritoCompras();
		producto1.getColorProducto();
		producto1.getMarcaProducto();
		producto1.getNombreProducto();
		producto1.getPrecioProducto();
		producto1.getTamañoProducto();
		producto1.getIdProducto();
		producto1.getClaveProducto();
		List<Producto> productos1 = new ArrayList<Producto>();
		productos1.add(producto1);
		carritoCompras.setProductos(productos1);
		

		while (select != 4) {

			System.out.println("Elige opción:" + "\n1.- Agregar Producto" + "\n2.- Quitar Producto\n" + "3.- Salir\n");
			select = Integer.parseInt(leer.nextLine());

			switch (select) {
			case 1:
				int elegirProducto = 0;
				System.out.println("001.- ASUS");
				System.out.println("002.- ACER");
				elegirProducto = leer2.nextInt();
				if (elegirProducto == 001) {
					for (int i = 0; carritoCompras.getProductos().size() > i; i++) {

						System.out.println(carritoCompras.getProductos().get(i).getClaveProducto());
						System.out.println(carritoCompras.getProductos().get(i).getColorProducto());
						System.out.println(carritoCompras.getProductos().get(i).getMarcaProducto());
						System.out.println(carritoCompras.getProductos().get(i).getNombreProducto());
						System.out.println(carritoCompras.getProductos().get(i).getPrecioProducto());
						System.out.println(carritoCompras.getProductos().get(i).getTamañoProducto());
					}

				} else {
					for (int i = 0; carritoCompras.getProductos().size() > i; i++) {

						System.out.println(carritoCompras.getProductos().get(i).getClaveProducto());
						System.out.println(carritoCompras.getProductos().get(i).getColorProducto());
						System.out.println(carritoCompras.getProductos().get(i).getMarcaProducto());
						System.out.println(carritoCompras.getProductos().get(i).getNombreProducto());
						System.out.println(carritoCompras.getProductos().get(i).getPrecioProducto());
						System.out.println(carritoCompras.getProductos().get(i).getTamañoProducto());
					}

				}
				System.out.println("Se agrego correctamente");
				break;
			case 2:
				int elegirProdEliminar = 0;
				System.out.println("Escriba la clave del producto a eliminar");
				elegirProdEliminar = leer2.nextInt();
				if (elegirProdEliminar == 001) {
					for (int i = 0; carritoCompras.getProductos().size() > i; i++) {
						
							carritoCompras.getProductos().remove(i);

					}

				} else {
					for (int i = 0; carritoCompras.getProductos().size() > i; i++) {

						carritoCompras.getProductos().remove(i);
					}

				}

				System.out.println("Se elimino producto");
				break;
			case 3:
				 System.exit(0);
				System.out.println("SALIR");
				break;
			default:
				System.out.println("NUMERO NO RECONOCIDO");
				break;
			}
		}

	}
	
	public static void main(String arg[]) {
		UsuarioController usuarioController = new UsuarioController();
		System.out.println(usuarioController.getNombreUsuarioByRFC("OO999999UI"));
	
	}

}


