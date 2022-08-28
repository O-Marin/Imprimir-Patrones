package ejercicios.ejercicio1;

import java.util.Scanner;

public class promedioDeNotas {
	public void promedio() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresar 3 notas entre 1 y 7");
		
		System.out.println("nota 1");
		int nota1 = sc.nextInt();
		while ((nota1 < 1) || (nota1 > 7)){
			System.out.println("Nota " + nota1 +  " invalida, por favor intentar nuevamente, Insertar una nota entre 1 y 7");
			nota1 = sc.nextInt();
		}
		
		
		System.out.println("nota 2");
		int nota2 = sc.nextInt();
		while ((nota2 < 1) || (nota2 > 7)){
			System.out.println("Nota " + nota2 +  " invalida, por favor intentar nuevamente, Insertar una nota entre 1 y 7");
			nota2 = sc.nextInt();
		}
		
		System.out.println("nota 3");
		int nota3 = sc.nextInt();
		while ((nota3 < 1) || (nota3 > 7)){
			System.out.println("Nota " + nota3 +  " invalida, por favor intentar nuevamente, Insertar una nota entre 1 y 7");
			nota3 = sc.nextInt();
		}
	}
}
