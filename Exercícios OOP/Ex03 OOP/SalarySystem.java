/* PT-BR |
 * Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto).
 * Em seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido).
 * Em seguida, aumentar o sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto � afetado pela porcentagem),
 * e mostrar novamente os dados do funcion�rio.
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

		Employee employee = new Employee(); // Inst�ciou o objeto
		
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
