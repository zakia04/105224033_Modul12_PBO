import java.util.*;

class PaymentMethodFactory {
    public static PaymentMethod create(String methodType) {
        switch (methodType) {
            case "CreditCard":
                return new CreditCardPayment();
            case "OVO":
                return new OvoPayment();
            case "TransferBank":
                return new BankTransferPayment();
            case "GiftVoucher":
                return new GiftVoucherPayment();
            default:
                throw new IllegalArgumentException("Metode pembayaran tidak dikenal: " + methodType);
        }
    }
}