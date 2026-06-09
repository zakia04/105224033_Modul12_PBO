import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Notifier> notifiers = Arrays.asList(new EmailSystem(), new SmsSystem(), new WhatsAppSystem());
        RefundablePaymentMethod creditCard = (RefundablePaymentMethod) PaymentMethodFactory.create("CreditCard");
        OrderService orderService = new OrderService(creditCard, notifiers);
        orderService.processPayment(150000);
        orderService.sendReceipt("Kia", "INV-2026-001");
        creditCard.refund(50000); 
        System.out.println();

        PaymentMethod voucher = PaymentMethodFactory.create("GiftVoucher");
        OrderService voucherOrder = new OrderService(voucher, notifiers);
        voucherOrder.processPayment(50000);
        voucherOrder.sendReceipt("Zaki", "INV-2026-002");
    }
}