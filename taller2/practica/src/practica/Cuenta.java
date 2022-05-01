package practica;

public class Cuenta {
	
	private double saldo;

	public Cuenta (double saldoInicial) {
		if (saldoInicial <= 0) {
			this.saldo = 0;
		}else {
			this.saldo = saldoInicial;
		}
		
	}
	
	public double getSaldo() {
		return saldo;
	}

	public double abonar(double monto) {
		if (monto > this.saldo) {
			System.out.println("No es posible realizar la operacion ya que el monto ingresado es mayor al saldo que hay en la cuenta");
		}else {
			System.out.println("Operacion ralizada con exito. Muchas gracias");
			System.out.println("saldo anterior: " + this.saldo + " - " + "Monto : " + monto);
			this.saldo = this.saldo - monto;
		}
		
		return saldo;
	}
	
	
	
}
