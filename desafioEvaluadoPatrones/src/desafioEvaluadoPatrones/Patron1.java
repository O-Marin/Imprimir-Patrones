package desafioEvaluadoPatrones;

import java.util.Scanner;

public class Patron1 {

	public static void patronUno() {
		// *.*.*.*.*.*.*
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar valor n");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(".");
			} else {
				System.out.print("*");
			}
			
		}
	}

	public static void patronDos() {
		// 12341234
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar valor n");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 4 == 1) {
				System.out.print("1");
			} else if (i % 4 == 2) {
				System.out.print("2");
			} else if (i % 4 == 3) {
				System.out.print("3");
			} else if (i % 4 == 0) {
				System.out.print("4");
			
			}
		}
	}
	
	public static void patronTres() {
		// ||*||*||*||*
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar valor n");
		int n = sc.nextInt();
		
		for (int i = 1 ; i <= n;i++) {
			if (i%3==0) {
				System.out.print("*");
			}else {
				System.out.print("|");
			}
		}
	}
}