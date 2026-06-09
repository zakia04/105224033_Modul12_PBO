import java.util.*;

class OrderService {
    private final PaymentMethod paymentMethod; 
    private final List<Notifier> notifiers;    
    public OrderService(PaymentMethod paymentMethod, List<Notifier> notifiers) {
        this.paymentMethod = paymentMethod;
        this.notifiers = notifiers;
    }
    public void processPayment(double amount) {
        System.out.println("[OrderService]   Memulai proses pembayaran...");
        this.paymentMethod.pay(amount);
        System.out.println("[OrderService]   Pembayaran selesai.");
    }
    public void sendReceipt(String customerName, String invoiceNumber) {
        String message = "Halo " + customerName + ", pesanan Anda dengan nomor " + invoiceNumber + " telah diproses.";
        for (Notifier notifier : notifiers) {
            notifier.send(message);
        }
    }
}