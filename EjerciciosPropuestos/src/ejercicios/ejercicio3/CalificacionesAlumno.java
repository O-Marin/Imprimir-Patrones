package ejercicios.ejercicio3;

import java.util.Scanner;

public class CalificacionesAlumno {
	public void calificacion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar nombre alumno");
		String nombre = sc.nextLine();
		
		System.out.println("Ingresar apellido alumno");
		String apellido = sc.nextLine();
		
		System.out.println("Ingresar asignatura");
		String asignatura = sc.nextLine();
		
		System.out.println("Ingresar apellido del docente a cargo");
		String apellidoDocente = sc.nextLine();
		
		System.out.println("Ingresar primera nota");
		float nota1 = sc.nextFloat();
		while ((nota1 < 1) || (nota1 > 7)){
			System.out.println("Nota " + nota1 +  " invalida, por favor intentar nuevamente, Insertar una nota entre 1 y 7");
			nota1 = sc.nextFloat();
		}
		
		System.out.println("Ingresar segunda nota");
		float nota2 = sc.nextFloat();
		while ((nota2 < 1) || (nota2 > 7)){
			System.out.println("Nota " + nota2 +  " invalida, por favor intentar nuevamente, Insertar una nota entre 1 y 7");
			nota2 = sc.nextFloat();
		}
		
		System.out.println("Ingresar tercera nota");
		float nota3 = sc.nextFloat();
		while ((nota3 < 1) || (nota3 > 7)){
			System.out.println("Nota " + nota3 +  " invalida, por favor intentar nuevamente, Insertar una nota entre 1 y 7");
			nota3 = sc.nextFloat();
		}
		
		String ficha = String.format("Alumno: %s %s\n Asignatura: %s\n Docente: Sr./Sra. %s\n Nota 1: %.1f\n Nota 2: %.1f\n Nota 3: %.1f", nombre, apellido, asignatura, apellidoDocente,nota1,nota2,nota3);
		System.out.println(ficha);
	
		
	}
}
