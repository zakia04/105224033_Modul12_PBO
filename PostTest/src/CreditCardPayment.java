class CreditCardPayment implements RefundablePaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("[CreditCard]\t\t  Memanggil API bank untuk pembayaran sebesar Rp" + amount);
    }
    @Override
    public void refund(double amount) {
        System.out.println("[CreditCard]\t\t  Refund sebesar Rp" + amount + " diproses");
    }
}
