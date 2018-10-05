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

	public static void main(String[] args)  {		
		
		SystemTray notifiactionTray = SystemTray.getSystemTray();
		Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
		TrayIcon notifiactionTrayIcon = new TrayIcon(image, "Tray Demo");
		notifiactionTrayIcon.setImageAutoSize(true);
		notifiactionTrayIcon.setToolTip("System tray icon demo");
		
		try {
			notifiactionTray.add(notifiactionTrayIcon);
		} catch(AWTException exception) {
			//handle
		}
		
		notifiactionTrayIcon.displayMessage("Welcome to Windows10", "Windows10 Style Notification", MessageType.INFO);
	}
}
