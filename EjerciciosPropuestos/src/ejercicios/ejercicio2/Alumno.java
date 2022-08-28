package ejercicios.ejercicio2;

import java.util.Scanner;

public class Alumno {
	public void fichaAlumno() {
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
		int nota1 = sc.nextInt();
		
		System.out.println("Ingresar segunda nota");
		int nota2 = sc.nextInt();
		
		System.out.println("Ingresar tercera nota");
		int nota3 = sc.nextInt();
		
		String ficha = String.format("Alumno: %s %s\n Asignatura: %s\n Docente: Sr./Sra. %s\n Nota 1: %d\n Nota 2: %d\n Nota 3: %d", nombre, apellido, asignatura, apellidoDocente,nota1,nota2,nota3);
		System.out.println(ficha);
	
	}
}
