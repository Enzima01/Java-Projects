/*
* Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas
* trabalhadas, o valor que recebe por hora e calcula o sal�rio desse
* funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas
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
