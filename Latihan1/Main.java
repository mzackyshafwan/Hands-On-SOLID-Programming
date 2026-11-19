public class Main {
    public static void main(String[] args) {
        new NotificationService(new EmailNotifier()).kirim("Halo, ini email test!");
        new NotificationService(new SMSNotifier()).kirim("Ini SMS test!");
        new NotificationService(new WhatsAppNotifier()).kirim("Ini pesan WhatsApp test!");

        // Kanal baru tanpa mengubah NotificationService maupun kelas notifier lama
        new NotificationService(new TelegramNotifier()).kirim("Ini pesan Telegram test!");
        new NotificationService(new PushNotifier()).kirim("Ini Push Notification test!");
    }
}
