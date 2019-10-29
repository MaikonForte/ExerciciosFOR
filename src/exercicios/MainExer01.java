package exercicios;

import java.util.Scanner;

public class MainExer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = input.nextInt();
			}
			
			}
		System.out.println("Diagonal");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");

		}
		System.out.println();
		int conta = 0;
		for (int i = 0; i<n; i++) {
			for (int j =0; j<n; j++) {
				if (mat[i][j] < 0) {
					conta++;
				}
			}
		}
		System.out.println("Numeros negativos: " + conta);

	}
}


