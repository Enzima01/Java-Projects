package services;

public class SmsService implements Notifier {
	
	public void send(String message) {
		System.out.print("Sending SMS notification: " + message);
	}
}
