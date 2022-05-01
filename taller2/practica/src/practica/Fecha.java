package practica;

//import java.util.*;

public class Fecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int dia = 25;
		int mes = 12;
		int anio = 2021;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese dia por favor: ");
		dia = sc.nextInt();
		System.out.println("Ingrese mes por favor: ");
		mes = sc.nextInt();
		System.out.println("Ingrese anio por favor: ");
		anio = sc.nextInt();*/
		
		creaFecha(1,1,2022);
		creaFecha(1,1);
		creaFecha(1);

	}
	
	public static void creaFecha(int dia, int mes, int anio) {
		System.out.println(dia + "/" + mes + "/" + anio );
	}
	public static void creaFecha(int dia, int mes) {
		System.out.println(dia + "/" + mes + "/" + "2021" );
	}
	public static void creaFecha(int dia) {
		System.out.println(dia + "/" + "12" + "/" + "2021" );
	}

}
