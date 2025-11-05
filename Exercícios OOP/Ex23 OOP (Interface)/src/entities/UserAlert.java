package entities;

import services.Notifier;

public class UserAlert {
	private Notifier notification;

	public UserAlert(Notifier notification) {
		this.notification = notification;
	}

	public UserAlert() {
	}

	public Notifier getNotification() {
		return notification;
	}

	public void setNotification(Notifier notification) {
		this.notification = notification;
	}

	public void alert(String message) {
		notification.send(message);
	}
}
