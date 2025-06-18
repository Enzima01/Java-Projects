/* PT-BR|
 * Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, 
 * o nome do titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta.
 * Este valor de depósito inicial, entretanto, é opcional, ou seja: 
 * se o titular não tiver dinheiro a depositar no momento de abrir sua conta, 
 * o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
 * 
 * Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
 * o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
 * exemplo).
 *
 * Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. 
 * O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. 
 * Para cada saque realizado, o banco cobra uma taxa de $ 5.00. 
 * Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa.
 *
 * Fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
 * informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
 * mostrando os dados da conta após cada operação.
 * 
 * EN|
 * In a bank, to register a bank account, it is necessary to provide the account number, 
 * the account holder's name, and the amount of the initial deposit that the holder made when opening the account. 
 * However, this initial deposit amount is optional, meaning:
 * if the account holder has no money to deposit at the time of opening the account, 
 * the initial deposit will not be made and the account's initial balance will naturally be zero.
 * 
 * Important: once a bank account has been opened, the account number can never be changed.
 * The account holder's name, however, can be changed (as a person may change their name due to marriage, for example).
 * 
 * Finally, the account balance cannot be changed freely. There must be a mechanism to protect it.
 * The balance only increases through deposits and decreases through withdrawals.
 * For each withdrawal made, the bank charges a fee of $5.00.
 * Note: the account may have a negative balance if there is not enough to cover the withdrawal and/or the fee.
 * 
 * Create a program that registers an account, giving the option to include or not include an initial deposit.
 * Then, perform a deposit and a withdrawal, always displaying the account details after each operation.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();

		System.out.print("Is there any initial deposit? (y/n): ");
		char answer = sc.next().charAt(0);

		double balance = 0;

		if (answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();
		}

		Account account = new Account(number, name, balance);

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println();

		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);

		System.out.println("Updated Account Data: ");
		System.out.println(account);

		System.out.println();

		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated Account Data: ");
		System.out.println(account);

		sc.close();
	}

}
