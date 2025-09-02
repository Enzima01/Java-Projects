/*	PT-BR|
 * 	Fazer um programa para ler 2 numeros inteiros, M e N,
 *  e depois ler uma matriz de M linhas e N colunas contendo numeros inteiros, podendo haver repetições.
 *  Em seguida, ler um numero inteiro X que pertence a matriz.
 *  Para cada ocorrência de X, mostrar os valores acima, abaixo, a esquerda e a direita de X, quando houver.
 *  
 *  EN|
 *  Write a program to read 2 integers, M and N,
 *	and then read a matrix with M rows and N columns containing integers, where repetitions are allowed.
 *	Next, read an integer X that belongs to the matrix.
 *	For each occurrence of X, display the values above, below, to the left, and to the right of X, whenever they exist.
 */



import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numero de linhas: ");
		int m = sc.nextInt();
		System.out.print("Digite o numero de colunas: ");
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		System.out.println("Digite os valores contidos na matriz " + m + "x" + n + ": ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.print("Digite um numero que pertence a matriz: ");
		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("\nPosition " + i + "," + j + ": ");

					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}

					if (i < mat[i].length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}

					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}

					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}

				}
			}
		}

		sc.close();
	}

}
