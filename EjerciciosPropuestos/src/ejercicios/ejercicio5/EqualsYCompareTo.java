package ejercicios.ejercicio5;

import java.util.Scanner;

public class EqualsYCompareTo {
	public void comparacion() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insertar una cadena de texto");
		String uno = sc.nextLine();
		System.out.println("Insertar otra cadena de texto");
		String dos = sc.nextLine();
		
		if (uno.equals(dos)) {
			System.out.println("Ambas cadenas son iguales");
			}else {
				System.out.println("Las cadenas son distintas");
			}
		Integer comparacion = uno.compareTo(dos);
		if (comparacion < 0) {
			System.out.println("Cadena dos es mayor que cadena uno");
			
		}else if(comparacion > 0){
				System.out.println("Cadena uno mayor a cadena dos");
			}else {
				System.out.println("Cadena uno igual a cadena dos");
			}
		System.out.println(comparacion);
		sc.close();
	}
	
}
