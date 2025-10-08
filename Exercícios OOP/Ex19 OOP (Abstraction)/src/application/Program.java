/* PT-BR|
 * Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais podem ser pessoa física ou pessoa jurídica,
 * e depois mostrar o valor do imposto pago por cada um, bem como o total de imposto arrecadado.
 * Os dados de pessoa física são: nome, renda anual e gastos com saúde. 
 * Os dados de pessoa jurídica são nome, renda anual e número de funcionários.
 * As regras para cálculo de imposto são as seguintes:
 * 
 * -Pessoa física: pessoas cuja renda foi abaixo de $20000.00 pagam 15% de imposto.
 * Pessoas com renda de $20000.00 em diante pagam 25% de imposto.
 * Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no imposto.
 * 
 * -Pessoa jurídica: pessoas jurídicas pagam 16% de imposto.
 * Porém, se a empresa possuir mais de 10 funcionários, ela paga 14% de imposto.
 * 
 * EN|
 * Create a program to read the data of N taxpayers (N provided by the user), which can be individuals or legal entities,
 * and then display the amount of tax paid by each, as well as the total tax collected.
 * The data for an individual is: name, annual income, and healthcare expenses.
 * The data for a legal entity is: name, annual income, and number of employees.
 * The rules for calculating taxes are as follows:
 *
 * -Individual: People whose income is below $20000.00 pay 15% tax.
 * People with income of $20000.00 or higher pay 25% tax.
 * If the individual had healthcare expenses, 50% of these expenses are deducted from the tax.
 *
 * -Legal entity: Legal entities pay 16% tax.
 * However, if the company has more than 10 employees, it pays 14% tax. 
 */

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("\nTax payer #" + (i + 1) + (" data: "));
			System.out.print("Individual or Company (i/c)? ");
			char resp = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			switch (resp) {
			case 'i':
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				TaxPayer individual = new Individual(name, anualIncome, healthExpenditures);
				list.add(individual);
				break;

			case 'c':
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				TaxPayer company = new Company(name, anualIncome, numberOfEmployees);
				list.add(company);
				break;

			default:
				System.out.println("Invalid option!");
			}
		}

		System.out.println("\nTAXES PAID");
		for (TaxPayer users : list) {
			System.out.println(users.getName() + ": $ " + String.format("%.2f", users.tax()));
		}

		double soma = 0;
		for (TaxPayer sum : list) {

			soma += sum.tax();
		}
		System.out.printf("\nTOTAL TAXES: %.2f", soma);

		sc.close();
	}

}
