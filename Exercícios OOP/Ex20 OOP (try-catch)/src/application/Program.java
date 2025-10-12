/* PT-BR|
 * Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária, mostrando o novo saldo.
 * Um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de saque da conta.
 * 
 * EN|
 * Create a program to read bank account data and then make a withdraw from that account, displaying the new balance.
 * A withdraw cannot occur if there is no balance in the account, or if the withdraw amount exceeds the account's withdraw limit.
 */

package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AccountException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data: ");

			System.out.print("Number: ");
			int number = sc.nextInt();

			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();

			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();

			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();

			Account account = new Account(number, holder, balance, withdrawLimit);

			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();

			account.withdraw(amount);

			System.out.println("New balance: " + account.getBalance());
		} catch (AccountException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Input type error: " + e.getMessage());
		}
		sc.close();
	}

}
