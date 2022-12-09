package actividades3_partea.conversortemperaturas;

import java.util.Scanner;
public class ConversorTemperaturas {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("\n\tBienvenido al Conversor de Temperaturas\n");
	System.out.print("Introduce el valor que quieres convertir : ");
	float value = scan.nextFloat();
	System.out.println("  Pulsa 1 para cambiar Celsius-Fahrenheit....");
	System.out.println("  Pulsa 2 para cambiar Fahrenheit-Celsius....");
	System.out.print("\nSelecciona la opcion...   ");
	int ans = scan.nextInt();
	if (ans == 1) {
		float value1 = (float) ((value*(1.8))+32);
		System.out.print("Tu conversion está aqui.. "+value1+"�F");
		}
	if (ans == 2) {
			float value2 = (float) (value-32);
			float value3 = (float) (value2*(5)/9);
			System.out.print("Tu conversión está aqui.. "+value3+"�C");
		}
	System.out.println("\n\tGracias!!..");
	}
}
