/*Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel" */

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de divis�es: ");

		int n = sc.nextInt();
		int i;

		for (i = 0; i < n; i++) {

			System.out.print("Digite o numerador: ");
			double a = sc.nextDouble();

			System.out.print("Digite o denominador: ");
			double b = sc.nextDouble();

			double div = a / b;

			if (b == 0) {
				System.out.println("Divis�o Impossivel!");
			}
			else {
				System.out.println(div);
			}
		}
		sc.close();
	}

}
