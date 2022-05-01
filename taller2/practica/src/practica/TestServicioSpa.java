package practica;

import java.util.*;

public class TestServicioSpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese servicio por favor");
		String servicio1 = sc.nextLine();
		System.out.println("ingrese precio por favor");
		double precio1 = sc.nextDouble();
		System.out.println("ingrese servicio por favor");
		sc.nextLine();
		String servicio2 = sc.nextLine();
		System.out.println("ingrese precio por favor");
		double precio2 = sc.nextDouble();
		
		ServicioSpa spa1 = new ServicioSpa(servicio1, precio1);
		ServicioSpa spa2 = new ServicioSpa(servicio2, precio2);
		System.out.println(spa1.getDescripcion() + " $" + spa1.getPrecio());
		System.out.println(spa2.getDescripcion() + " $" + spa2.getPrecio());
		/*
		System.out.println("ingrese servicio por favor");
		String servicio1 = sc.nextLine();
		System.out.println("ingrese precio por favor");
		double precio1 = sc.nextDouble();
		
		spa1.setDescripcion(servicio1);
		spa1.setPrecio(precio1);
		System.out.print(spa1.getDescripcion());
		System.out.println(" $" + spa1.getPrecio());
		
		System.out.println("ingrese servicio por favor");
		sc.nextLine();
		String servicio2 = sc.nextLine();
		System.out.println("ingrese precio por favor");
		double precio2 = sc.nextDouble();
		
		spa2.setDescripcion(servicio2);
		spa2.setPrecio(precio2);
		System.out.print(spa2.getDescripcion());
		System.out.println(" $" + spa2.getPrecio());
		*/
		
		
		sc.close();
		
		
	}

}
