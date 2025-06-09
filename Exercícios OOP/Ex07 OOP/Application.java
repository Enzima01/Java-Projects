/* PT-BR |
 * Fazer um programa para ler a cota��o do d�lar,
 * e depois um valor em d�lares a ser comprado por uma pessoa em reais.
 * Informar quantos reais a pessoa vai pagar pelos d�lares,
 * considerando ainda que a pessoa ter� que pagar 6% de Imposto sobre Opera��es Financeiras (IOF) sobre o valor em d�lar.
 *
 * EN |
 * Create a program to read the current exchange rate of the dollar,
 * then read an amount in dollars to be bought by a person in reais (Brazilian currency).
 * Show how many reais the person will pay for the dollars,
 * considering that a 6% tax (IOF - Tax on Financial Operations) will be applied to the dollar amount.
 */

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price?: ");
		double dollarPrice = sc.nextDouble();

		System.out.print("How many dollars will be bought?: ");
		double dollarBought = sc.nextDouble();

		double total = CurrencyConverter.Total(dollarPrice, dollarBought);
		System.out.println("Amount to be paid in reais: R$ " + total);

		sc.close();

	}

}
