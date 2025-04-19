/*
* Com base em uma tabela, escreva um programa que leia o código de um item e
* a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
*/

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("-------------------------------------");
		System.out.println("CÓDIGO |    PRODUTO     |   PREÇO");
		System.out.println("-------------------------------------");

		System.out.println(" 1  |  Cachorro Quente  |  R$ 4,00");
		System.out.println(" 2  |     X-Salada      |  R$ 4,50");
		System.out.println(" 3  |     X-Bacon       |  R$ 5,00");
		System.out.println(" 4  |  Torrada simples  |  R$ 2,00");
		System.out.println(" 5  |   Refrigerante    |  R$ 1,50");
		System.out.println("-------------------------------------");

		System.out.print("Digite o codigo do produto: ");
		int produto = sc.nextInt();
		System.out.print("Digite a quantidade: ");
		int qtd = sc.nextInt();

		if (produto == 1) {
			float valor = 4;
			float total = valor * qtd;
			System.out.printf("Total: %.2f R$", total);
		} else if (produto == 2) {
			float valor = (float) 4.50;
			float total = valor * qtd;
			System.out.printf("Total: %.2f R$", total);
		} else if (produto == 3) {
			float valor = 5;
			float total = valor * qtd;
			System.out.printf("Total: %.2f R$", total);
		} else if (produto == 4) {
			float valor = 2;
			float total = valor * qtd;
			System.out.printf("Total: %.2f R$", total);
		} else if (produto == 5) {
			float valor = (float) 1.50;
			float total = valor * qtd;
			System.out.printf("Total: %.2f R$", total);
		}

	}

}
