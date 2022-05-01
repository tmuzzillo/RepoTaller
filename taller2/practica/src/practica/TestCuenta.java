package practica;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta cuenta1 = new Cuenta(-20);
		Cuenta cuenta2 = new Cuenta(50);
		
		//PARA CUENTA 1
		//mostramos el saldo en pantalla
		System.out.println("Su saldo actual es: " + cuenta1.getSaldo());
		
		//realizamos operaciones de debito
		cuenta1.abonar(20);
		
		//mostramos el saldo en pantalla
		System.out.println("Su saldo actual es: " + cuenta1.getSaldo());
		
		System.out.println("--------------------------------------------");
		
		//PARA CUENTA 2
		
		System.out.println("Su saldo actual es: " + cuenta2.getSaldo());
		
		cuenta2.abonar(30.5);
		
		System.out.println("Su saldo actual es: " + cuenta2.getSaldo());
		

	}

}
