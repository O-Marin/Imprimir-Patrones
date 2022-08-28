package ejercicios.ejercicio1;

import java.util.Scanner;

public class Resultado {
	public void promedio() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresar 3 notas entre 1 y 7");
		
		System.out.println("nota 1");
		float nota1 = sc.nextFloat();
		while ((nota1 < 1) || (nota1 > 7)){
			System.out.println("Nota " + nota1 +  " invalida, por favor intentar nuevamente, Insertar una nota entre 1 y 7");
			nota1 = sc.nextInt();
		}
		
		
		System.out.println("nota 2");
		float nota2 = sc.nextFloat();
		while ((nota2 < 1) || (nota2 > 7)){
			System.out.println("Nota " + nota2 +  " invalida, por favor intentar nuevamente, Insertar una nota entre 1 y 7");
			nota2 = sc.nextInt();
		}
		
		System.out.println("nota 3");
		float nota3 = sc.nextFloat();
		while ((nota3 < 1) || (nota3 > 7)){
			System.out.println("Nota " + nota3 +  " invalida, por favor intentar nuevamente, Insertar una nota entre 1 y 7");
			nota3 = sc.nextInt();
		}
		
		
		float promedio = (nota1 + nota2 + nota3)/3;	
		
		
		if (promedio < 4) {
			System.out.println("El promedio del alumno es: "+ promedio + " el alumno a reprobado");
		}else if (promedio >= 4) {
			System.out.println("El promedio del alumno es: "+ promedio + " el alumno a aprobado");
		}
		 
			
		sc.close();
		
		
		
		}
	}

