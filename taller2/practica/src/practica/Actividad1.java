package practica;

import javax.swing.JOptionPane;

public class Actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese un numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese otro numero"));
		calculos(num1, num2);
		determinarExtremos(num1, num2);
		
		//USAR parseFloat
		float num3 = Float.parseFloat(JOptionPane.showInputDialog("Por favor, ingrese un numero"));
		float num4 = Float.parseFloat(JOptionPane.showInputDialog("Por favor, ingrese un numero"));
		calculos(num3, num4);
		determinarExtremos(num3, num4);

	}
	public static void calculos(int a, int b) {
		
		int suma = a+b;
		JOptionPane.showMessageDialog(null, "Suma: " + suma);
		int resta = a-b;
		JOptionPane.showMessageDialog(null, "Resta: " + resta);
		int producto = a*b;
		JOptionPane.showMessageDialog(null, "Producto: " + producto);
		int promedio = (a+b)/2;
		JOptionPane.showMessageDialog(null, "Promedio: " + promedio);
		
	}
	
	public static void determinarExtremos(int a, int b) {
		if (a>b) {
			JOptionPane.showMessageDialog(null, "Max: " + a + " Min: " + b);
		}else {
			JOptionPane.showMessageDialog(null, "Max: " + b + " Min: " + a);
		}
	}
	//SOBRECARGA DE METODOS	
		public static void calculos(float a, float b) {
			
			float suma = a+b;
			JOptionPane.showMessageDialog(null, "Suma: " + suma);
			float resta = a-b;
			JOptionPane.showMessageDialog(null, "Resta: " + resta);
			float producto = a*b;
			JOptionPane.showMessageDialog(null, "Producto: " + producto);
			float promedio = (a+b)/2;
			JOptionPane.showMessageDialog(null, "Promedio: " + promedio);
			
		}
		
		public static void determinarExtremos(float a, float b) {
			if (a>b) {
				JOptionPane.showMessageDialog(null, "Max: " + a + " Min: " + b);
			}else {
				JOptionPane.showMessageDialog(null, "Max: " + b + " Min: " + a);
			}
		}
}

	


