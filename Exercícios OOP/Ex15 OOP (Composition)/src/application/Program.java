/* PT-BR|
 * Crie um programa para cadastrar funcionários em um departamento.
 * O usuário deve informar o nome do departamento, a quantidade de funcionários e, para cada funcionário, seu nome, idade e cargo.
 * Cada funcionário pertence a um departamento, e cada departamento possui uma lista de funcionários.
 * Ao final, o programa deve exibir os dados do departamento com todos os funcionários cadastrados.
 * 
 * EN|
 * Create a program to register employees in a department.
 * The user must provide the department name, the number of employees, and for each employee, their name, age, and position.
 * Each employee belongs to a department, and each department has a list of employees.
 * At the end, the program must display the department data along with all registered employees.
 */

package application;

import java.util.Scanner;

import entities.Departamento;
import entities.Funcionario;
import entities.enums.Cargo;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o departamento? ");
		String nomeDepartamento = sc.nextLine();
		
		Departamento departamento = new Departamento(nomeDepartamento);

		System.out.print("Quantas pessoas trabalha nesse departamento? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			
			System.out.print("\nDigite o nome do funcionario #" + (i + 1) + ": ");
			String nome = sc.nextLine();
			
			System.out.print("Digite a idade de " + nome + ": ");
			int idade = sc.nextInt();
			
			System.out.print("Digite o cargo: ");
			Cargo cargo = Cargo.valueOf(sc.next());

			Funcionario funcionario = new Funcionario(nome, idade, cargo, departamento);
			departamento.addFuncionario(funcionario);

		}

		System.out.println(nomeDepartamento);
		System.out.println(departamento);

		sc.close();
	}

}

