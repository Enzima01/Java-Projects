/*Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas,
come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
*/

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numero de linhas: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			int linha = i;
			int quadrado = (int) Math.pow(i, 2);
			int cubo = (int) Math.pow(i, 3);

			System.out.printf("%d %d %d%n", linha, quadrado, cubo);
		}
		sc.close();
	}

}
