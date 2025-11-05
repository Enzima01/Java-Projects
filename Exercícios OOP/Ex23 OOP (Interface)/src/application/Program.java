/* PT-BR|
 * Crie um sistema que envie notificações por diferentes meios (e-mail e SMS).
 * Implemente uma interface e teste as duas implementações.
 * Mostre que o código continua funcionando sem alterar a classe UserAlert
 * 
 * EN|
 * Create a system that sends notifications through different channels (email and SMS).
 * Implement an interface and test both implementations.
 * Show that the code still works without modifying the UserAlert class.
 */

package application;

import java.util.Scanner;

import entities.UserAlert;
import services.EmailService;
import services.SmsService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Type a message: ");
		String message = sc.nextLine();

		UserAlert emailAlert = new UserAlert(new EmailService());
		emailAlert.alert(message);

		System.out.println("\n");

		UserAlert smsAlert = new UserAlert(new SmsService());
		smsAlert.alert(message);

		sc.close();

	}

}
