/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo ser� encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situa��o sem escrever mensagem alguma).*/

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de X: ");
		float x = sc.nextFloat();
		System.out.print("Digite o valor de Y: ");
		float y = sc.nextFloat();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}

			x = sc.nextInt();
			y = sc.nextInt();

		}

	}

}
