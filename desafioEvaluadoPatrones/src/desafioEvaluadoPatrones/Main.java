package desafioEvaluadoPatrones;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Patron1.patronUno(); System.out.println(); Patron1.patronDos();
		 * System.out.println(); Patron1.patronTres(); System.out.println();
		 */
		/*
		 * Patron2.patron1(); System.out.println(); Patron2.patron2();
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar valor n");
		int n = sc.nextInt();
		int x = 0;
		while (x < n) {
			if (x == 0 || x == n - 1) {
				for (int i = 1; i <= n; i++) {
					System.out.print("*");
				}
			} else if (x != 0) {
				for (int i = 1; i <= n; i++) {
					if (i == 1 || i == n) {
					System.out.print(" ");
					}else {System.out.print("*");}
				}
			}
			System.out.println();
			x++;
		}
	}
}
