/*
* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
* calcule e mostre a diferença do produto de A e B pelo produto de C e D
* segundo a fórmula: DIFERENCA = (A * B - C * D).
*/

package ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");
		int a = entrada.nextInt();
		System.out.println("Digite o valor de B: ");
		int b = entrada.nextInt();
		System.out.println("Digite o valor de C: ");
		int c = entrada.nextInt();
		System.out.println("Digite o valor de D: ");
		int d = entrada.nextInt();
		int diferenca = (a * b - c * d);
		System.out.println("DIFERENÇA: " + diferenca);

	}

}
