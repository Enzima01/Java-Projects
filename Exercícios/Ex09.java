/*
* Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
* "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o
* m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem
* crescente ou decrescente.
*/


import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		

		Scanner entrada = new Scanner(System.in);

		int a, b;

		System.out.println("Digite um numero: ");
		a = entrada.nextInt();
		System.out.println("Digite outro numero: ");
		b = entrada.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("S�o Mult�plos!");
		} else {
			System.out.println("N�o s�o Mult�plos!");
		}
	}

}
