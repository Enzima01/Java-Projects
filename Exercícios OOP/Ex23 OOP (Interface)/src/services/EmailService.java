package services;

public class EmailService implements Notifier {

	public void send(String message) {
		System.out.print("Sending E-mail notification: " + message);
	}
}
