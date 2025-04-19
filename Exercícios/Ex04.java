/*
* Fazer um programa que leia o número de um funcionário, seu número de horas
* trabalhadas, o valor que recebe por hora e calcula o salário desse
* funcionário. A seguir, mostre o número e o salário do funcionário, com duas
* casas decimais.
*/

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Type your number: ");
		int number = in.nextInt();
		System.out.println("Type your hours worked: ");
		int hours = in.nextInt();
		System.out.println("Type how much money you receive per hour: ");
		float perhour = in.nextFloat();
		float salary = (int) hours * (float) perhour;
		System.out.printf("Number: %d  Salary: %.2f", number, salary);

	}

}
