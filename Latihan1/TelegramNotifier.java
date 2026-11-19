// Kanal baru: cukup menambah kelas baru, tanpa mengubah kode lama (OCP)
public class TelegramNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Mengirim Telegram: " + message);
    }
}
