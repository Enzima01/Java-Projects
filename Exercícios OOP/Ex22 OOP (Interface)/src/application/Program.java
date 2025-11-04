/* PT-BR|
 * Uma empresa deseja automatizar o processamento de seus contratos. 
 * O processamento de um contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no número de meses desejado.
 * A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas.
 * Os serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxa por pagamento.
 * Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplica juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.
 * Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato, e valor total do contrato).
 * Em seguida, o programa deve ler o número de meses para parcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor),
 * sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela dois meses após o contrato e assim por diante.
 * Mostrar os dados das parcelas na tela.
 * 
 * EN|
 * A company wants to automate the processing of its contracts.
 * Contract processing consists of generating the installments to be paid for that contract, based on the desired number of months.
 * The company uses an online payment service to make the installment payments.
 * Online payment services typically charge monthly interest, as well as a fee per payment.
 * For now, the service contracted by the company is PayPal, which applies simple interest of 1% to each installment, plus a 2% payment fee.
 * Write a program to read the data of a contract (contract number, contract date, and total contract value).
 * Then, the program should read the number of months for the contract installment plan, and then generate the records of installments to be paid (date and value),
 * with the first installment to be paid one month after the contract date, the second installment two months after the contract date, and so on.
 * Display the installment data on the screen.
 */

package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();

		Contract contract = new Contract(number, date, totalValue);

		System.out.print("Number of installment: ");
		int n = sc.nextInt();

		ContractService service = new ContractService(new PaypalService());

		service.processContract(contract, n);

		System.out.println("\nINSTALLMENTS:");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}

		sc.close();
	}

}
