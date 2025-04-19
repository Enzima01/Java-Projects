/*
* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
* valor da área deste círculo com quatro casas decimais conforme exemplos.
* Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
*/

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor do raio do círculo: ");
		float raio = entrada.nextFloat();
		float pi = (float) 3.14159;
		float area = (float) (pi * Math.pow(raio, 2));
		System.out.printf("Valor da area: %.4f", area);

	}

}
