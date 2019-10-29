package exercicios;

import java.util.Scanner;

public class MainExer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int m = input.nextInt();

		int[][] mat = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = input.nextInt();
			}
		}
		System.out.println("Diagonal");
		for (int i = 0; i < n && i < m; i++) {
			System.out.print(mat[i][i] + " ");

		}
		
		int x  = input.nextInt();
		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				if (mat[i][j] == x) {

					System.out.println("Position " + i + "," + j + ":");

					if (j > 0) {

						System.out.println("Left: " + mat[i][j - 1]);

					}

					if (i > 0) {

						System.out.println("Up: " + mat[i - 1][j]);

					}

					if (j < mat[i].length - 1) {

						System.out.println("Right: " + mat[i][j + 1]);

					}

					if (i < mat.length - 1) {

						System.out.println("Down: " + mat[i + 1][j]);

					}

				}

			}

		}

	}

}
