package com.wiley.springcore.factmetpat;

public class PFMMain {
	public static void main(String[] args) {
		NotificationFactory nf = new NotificationFactory();
		Notification not = nf.createNotification("EMAIL");
		not.notifyUser();
	}
}
