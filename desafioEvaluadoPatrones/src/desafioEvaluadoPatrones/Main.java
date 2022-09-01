package desafioEvaluadoPatrones;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// patrones simples
		/*
		 * Patron1.patronUno(); System.out.println(); Patron1.patronDos();
		 * System.out.println(); Patron1.patronTres(); System.out.println();
		 */
		// Patrones matriz
		/*
		 * Patron2.patron1(); System.out.println(); Patron2.patron2();
		 * System.out.println();
		 */
		// Patron2.patron3();System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Insertar un valor para n");
		int n = sc.nextInt();
		int x = n - 2;

		for (int i = 1; i <= n; i++) {
			if (i != 1 && i == n) {
				System.out.print(" ");
			} else {
				System.out.print("*");
			}
		}
		System.out.println();
		for (int j = 1; j <= x; j++) {
			for (int i = 1; i <= n; i++) {
				if (i == 1 || i == n) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				System.out.print(" ");
			} else
				System.out.print("*");
		}
	}
}
