package practica;
import java.util.*;
import javax.swing.*;

public class Juego {

	public static void main(String[] args) {
		/*generamos numero random del 1 al 10
		usamos scanner para que el usuario ingrese un num entero
		comprobamos si acerto el numero o no*/
		Random objetoRandom = new Random();
		int adivina = objetoRandom.nextInt(9);
		
		int vida=0;
		for (int i=0; i<100; i++) {
			
			int usuario = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese un numero"));
			
			if (adivina==usuario) {
				JOptionPane.showMessageDialog(null, "GANASTE, numero adivinado");
				break;
			}else {
				vida ++;
				if (vida == 3) {
					JOptionPane.showMessageDialog(null, "Se le acabaron las vidas, el numero era: " + adivina);
					break;
				}
				JOptionPane.showMessageDialog(null, "Intente de nuevo");
				
			}
		}
	}

}
