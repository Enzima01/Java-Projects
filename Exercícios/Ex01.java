/*
* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
* soma desses números com uma mensagem explicativa, conforme exemplos.
*/

import java.util.Scanner;

public class Ex01 {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		int x = entrada.nextInt();
		System.out.println("Digite outro numero inteiro: ");
		int y = entrada.nextInt();
		int soma = x + y;
		System.out.println("SOMA: " + soma);

	}

}
