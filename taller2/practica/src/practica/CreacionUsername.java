package practica;

import java.util.*;

public class CreacionUsername {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre por favor");
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese su apellido por favor");
		String apellido = sc.nextLine();
		
		System.out.println("Ingrese su edad por favor");
		String edad = sc.nextLine();
		
		//CREAMOS USERNAME
		String primer_letra = nombre.substring(0,1);
		String user = primer_letra.toUpperCase() + apellido.toLowerCase();
		System.out.println("Su nombre de usuario es: " + user);
		
		//CREAMOS CONTRASENIA
		String primeras3 = apellido.substring(0,3);
		String clave = nombre.toLowerCase() + primeras3.toUpperCase() + edad;
		System.out.println("Su clave es: " + clave);
		
		sc.close();
		
	}

}
