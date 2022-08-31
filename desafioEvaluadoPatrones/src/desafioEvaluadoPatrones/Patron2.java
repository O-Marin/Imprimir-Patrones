package desafioEvaluadoPatrones;

import java.util.Scanner;

public class Patron2 {
	public static void patron1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar valor n");
		int n = sc.nextInt();
		int x = 0;
		while (x < n) {
			if (x == 0 || x == n - 1) {
				for (int i = 1; i <= n; i++) {
					System.out.print("*");
				}
			} else {
				for (int i = 1; i <= n; i++) {
					if (i == 1 || i == n) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

			}
			System.out.println();
			x++;
		}
		

	}

	public static void patron2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar valor n");
		int n = sc.nextInt();
		int x = 0;
		while (x < n) {
			if (x == 0 || x == n - 1) {
				for (int i = 1; i <= n; i++) {
					System.out.print("*");
				}
			} else if (x != 0 || x != n - 1) {
				int j = n;
				for (int i = 1; i <= n; i++) {

					if (i == j - x) {
						System.out.print("*");
					} else if (i != j - x) {
						System.out.print(" ");
					}
				}
				j--;
			}
			System.out.println();
			x++;
		}
	}

	public static void patron3() {

	}
}
