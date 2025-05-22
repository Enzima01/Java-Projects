/* PT-BR |
 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
 * Em seguida, mostrar os dados do funcionário (nome e salário líquido).
 * Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem),
 * e mostrar novamente os dados do funcionário.
 * 
 * EN |
 * Create a program to read the data of a employee (name, gross salary and tax).
 * Then, show the employee's data (name and net salary).
 * Then, increase the employee's salary based on a given porcentage (only the gross salary is affected by the percentage),
 * and show the employee's data again.
 */

import java.util.Locale;
import java.util.Scanner;

public class SalarySystem {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee(); // Instâciou o objeto
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Employee: " + employee);
		
		System.out.println();
		
		System.out.print("Which percentage to increase salary?: ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		sc.close();

	}

}
