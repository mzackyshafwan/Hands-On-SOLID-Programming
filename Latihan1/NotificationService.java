// Bergantung pada abstraksi Notifier, bukan pada kelas konkret (DIP)
public class NotificationService {
    private final Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void kirim(String message) {
        notifier.send(message);
    }
}
