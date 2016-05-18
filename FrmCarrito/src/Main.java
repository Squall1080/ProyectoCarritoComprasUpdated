import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	// private static int index;

	public static void main(String arg[]) {

		Scanner leer = new Scanner(System.in);
		// Obtenemos un parametro de tipo String
		Usuario usuario = new Usuario("jorge");
		// Obtenemos un parametro de tipo objeto usuario
		Usuario usuario2 = new Usuario(usuario);
		// System.out.println(usuario.nombreUsuario);
		// Reasignamos un nuevo nombre para usuario2
		usuario2.nombreUsuario = "jorge2";
		// System.out.println(usuario2.nombreUsuario);
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario);
		usuarios.add(usuario2);
		// ciclo para recorrer todo el tamaño de la lista utilizando size
		for (int i = 0; usuarios.size() > i; i++) {
			System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡LISTA UNO¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
			System.out.println(usuarios.get(i).nombreUsuario);
			String usuarioInvertido = usuarios.get(i).nombreUsuario;
			for (int x = usuarioInvertido.length() - 1; x >= 0; x--) {
				System.out.println(usuarioInvertido.charAt(x));
			}
		}

		Banco banco = new Banco();
		banco.claveBanco = "12578";
		banco.nombreBanco = "Bancomer";
		banco.numReferencia = "1245";
		banco.claveCompra = "2222";
		banco.numCuenta = "12578260";
		List<Banco> bancos = new ArrayList<Banco>();
		bancos.add(banco);
		for (int i = 0; bancos.size() > i; i++) {
			System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡CLASE DEL BANCO¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
			System.out.println("CLAVE DEL BANCO" + " : " + bancos.get(i).claveBanco);
			System.out.println("CLAVE DE COMPRA" + " : " + bancos.get(i).claveCompra);
			System.out.println("NOMBRE DE BANCO" + " : " + bancos.get(i).nombreBanco);
			System.out.println("NUMERO DE CUENTA" + " : " + bancos.get(i).numCuenta);
			System.out.println("NUMERO DE REFERENCIA" + " : " + bancos.get(i).numReferencia);
		}

		Usuario usuario3 = new Usuario();
		usuario3.apMaternoUsuario = "ORDOÑEZ";
		usuario3.apPaternoUsuario = "LARA";
		usuario3.calleUsuario = "78";
		usuario3.nombreUsuario = "MANUEL";
		usuario3.rfcUsuario = "OOLJ901103";
		List<Usuario> usuarios2 = new ArrayList<Usuario>();
		usuarios2.add(usuario3);
		for (int i = 0; usuarios2.size() > i; i++) {
			System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡ ¡¡ LISTA DOS ¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
			System.out.println("APELLIDO PATERNO" + " : " + usuarios2.get(i).apPaternoUsuario);
			System.out.println("APELLIDO MATERNO" + " : " + usuarios2.get(i).apMaternoUsuario);
			System.out.println("NOMBRE DE USUARIO" + " : " + usuarios2.get(i).nombreUsuario);
			System.out.println("RFC USUARIO" + " : " + usuarios2.get(i).rfcUsuario);
			System.out.println("CALLE" + " : " + usuarios2.get(i).calleUsuario);

		}
		//Prueba
		List<Usuario> usuarios3 = new ArrayList<Usuario>();
		usuarios3.add(usuario3);
		usuarios3.add(usuario);
		usuarios3.add(usuario2);
		for (int i = 0; usuarios3.size() > i; i++) {
			System.out.println(
					"¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡ LISTA TRES ¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
			System.out.print(usuarios3.get(i).apMaternoUsuario);
			System.out.println(usuarios3.get(i).apPaternoUsuario);
			System.out.println(usuarios3.get(i).calleUsuario);
			System.out.println(usuarios3.get(i).nombreUsuario);
			System.out.println(usuarios3.get(i).rfcUsuario);
		}
		usuarios3.remove(0);
		for (int i = 0; usuarios3.size() > i; i++) {

			System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡Lista sin elementos¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
			System.out.print(usuarios3.get(i).apMaternoUsuario);
			System.out.println(usuarios3.get(i).apPaternoUsuario);
			System.out.println(usuarios3.get(i).calleUsuario);
			System.out.println(usuarios3.get(i).nombreUsuario);
			System.out.println(usuarios3.get(i).rfcUsuario);

		}

	}

	/*
	 * for (int i=0;i<=5;i++){
	 * 
	 * 
	 * 
	 * 
	 * 
	 * System.out.println( "Ingrese nombre:" ); ejemplo.nombre = leer.next();
	 * System.out.println( "Ingrese apellido paterno:" ); ejemplo.paterno =
	 * leer.next(); System.out.println( "Ingrese apellido materno:" );
	 * ejemplo.materno = leer.next(); System.out.println("Ingrese el rfc");
	 * ejemplo.rfc = leer.next(); System.out.println( "Ingrese calle:" );
	 * ejemplo.calle = leer.next();
	 * 
	 * 
	 * for(int x=list.size()-1;x>=0;x--){
	 * 
	 * list.add(ejemplo.nombre); System.out.println(ejemplo.nombre );
	 * list.add(ejemplo.paterno); list.add(ejemplo.materno);
	 * list.add(ejemplo.rfc); list.add(ejemplo.calle);
	 * 
	 * }
	 * 
	 * 
	 * 
	 * }
	 */

}
