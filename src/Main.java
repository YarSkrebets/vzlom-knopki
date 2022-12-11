import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        if (!Desktop.isDesktopSupported()) {
            System.out.println(":(");
            Runtime.getRuntime().exec("shutdown -r -t 10");
            System.exit(0);
        }

        Desktop.getDesktop().browse(URI.create("https://sun2.43222.userapi.com/impg/eA0NHjrfcNKs5edztr3TYqXUvsvwHUgvIUXuuQ/TdQeUsuWAic.jpg?size=241x209&quality=96&sign=9fa817ee64727be691bf7cf3310ec67a&type=album"));

        Thread.sleep(10 * 1000L);
        SystemTray tray = SystemTray.getSystemTray();
        Image image = Toolkit.getDefaultToolkit().getImage("icon.png");
        TrayIcon trayIcon = new TrayIcon(image);
        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip(":)");
        trayIcon.setPopupMenu(new PopupMenu("D"));

        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        trayIcon.displayMessage("тестовое уведомление", "тестовое сообщение", TrayIcon.MessageType.WARNING);
        Thread.sleep(100);


        for (int i = 1000; i > -10; i-=7) {
            trayIcon.displayMessage("ВЗЛОМ ОЧКА", i + " - 7 =" + (i-7), randomMessageType());
            Thread.sleep(100);
            System.out.println(i);
        }
        Thread.sleep(20 * 1000L);

        Desktop.getDesktop().browse(URI.create("https://sun9-22.userapi.com/impg/KQ3Ktjeqmr-HvNtP9VIIsv2YAP3nPI6aozpfzQ/ijk2GFWwzk4.jpg?size=225x225&quality=96&sign=78134838f007a0d12d3128076a89ea28&type=album"));

        while (true) {
            Thread.sleep(120 * 1000L);

            for (int i = 1000; i > -10; i-=7) {
                trayIcon.displayMessage(i + " - 7 =" + (i-7), i + " - 7 =" + (i-7), randomMessageType());
            }
            Desktop.getDesktop().browse(URI.create("https://sun9-77.userapi.com/impg/s3n6BotpXsNMXc4d6t23DxrE7LTmTWQ7BrGiKw/-p4sOBzIcS0.jpg?size=512x512&quality=95&sign=391da30cc0147763f5e2751795a4567e&type=album"));
        }
    }

    private static final TrayIcon.MessageType randomMessageType() {
        return TrayIcon.MessageType.values()[ThreadLocalRandom.current().nextInt(TrayIcon.MessageType.values().length)];
    }
}