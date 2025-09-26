/* PT-BR|
 * Uma empresa possui funcionários próprios e terceirizados.
 * Para cada funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora.
 * Funcionários terceirizado possuem ainda uma despesa adicional.
 * O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas,
 * sendo que os funcionários terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.
 * Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista.
 * Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.
 * 
 * EN|
 * A company has both regular and outsourced employees.
 * For each employee, it is necessary to register their name, hours worked, and value per hour.
 * Outsourced employees also have an additional expense.
 * The payment of employees corresponds to the hourly rate multiplied by the hours worked,
 * with outsourced employees receiving a bonus equal to 110% of their additional expense.
 * Write a program to read the data of N employees (N provided by the user) and store them in a list.
 * After reading all the data, display the name and payment of each employee in the same order they were entered.
 */


package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();

		System.out.print("Enter the number of employee: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("\nEmployee #" + (i + 1) + " data: ");

			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);

			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Hours: ");
			int hours = sc.nextInt();

			System.out.print("Value per hours: ");
			double valuePerHours = sc.nextDouble();

			if (outsourced == 'y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				Employee outsourcedEmployee = new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge);
				employees.add(outsourcedEmployee);
			} else {
				Employee employee = new Employee(name, hours, valuePerHours);
				employees.add(employee);
			}
		}

		System.out.println("\nPAYMENTS: ");
		for (Employee employee : employees) {
			System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
		}

		sc.close();
	}

}
