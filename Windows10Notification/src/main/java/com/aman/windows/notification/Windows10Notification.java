package com.aman.windows.notification;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;

/**
 * @author aman.verma
 *
 */

public class Windows10Notification {

	public static void main(String[] args) {

		// Create system tray object
		SystemTray notifiactionTray = SystemTray.getSystemTray();
		// Creates Icon Image
		Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
		// Tray Icon i.e. added to system tray
		TrayIcon notifiactionTrayIcon = new TrayIcon(image, "Tray Demo");
		notifiactionTrayIcon.setImageAutoSize(true);
		notifiactionTrayIcon.setToolTip("System tray icon demo");

		try {
			// Display notification
			notifiactionTray.add(notifiactionTrayIcon);
		} catch (AWTException awtException) {
			System.out.println("Exception occurred while creating notification : " + awtException);
			awtException.printStackTrace();
		}

		notifiactionTrayIcon.displayMessage("Welcome to Windows10", "Hello World", MessageType.INFO);
	}
}
