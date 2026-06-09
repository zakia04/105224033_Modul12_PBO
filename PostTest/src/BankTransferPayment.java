class BankTransferPayment implements RefundablePaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("[Transfer Bank]    Memproses transfer sebesar Rp" + amount);
    }
    @Override
    public void refund(double amount) {
        System.out.println("[Transfer Bank]    Refund sebesar Rp" + amount + " diajukan");
    }
}