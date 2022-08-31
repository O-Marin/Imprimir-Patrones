package ejercicios.ejercicio4;

import java.util.Scanner;

public class Pitagoras {
	public void calcularHipotenusa(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insertar cateto opuesto: ");
		double catOp = sc.nextDouble();
		System.out.println("Insertar cateto adyacente");
		double catAdy = sc.nextDouble();
		
		
		
	
				
			double hipotenuse = Math.sqrt((Math.pow(catOp, 2.0)+Math.pow(catAdy, 2.0)));
			System.out.println("El valor de la Hipotenusa es: " + hipotenuse);
	}
}
