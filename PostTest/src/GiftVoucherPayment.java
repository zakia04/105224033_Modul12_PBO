class GiftVoucherPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("[GiftVoucher]\t\t Menyimpan potongan voucher sebesar Rp" + amount);
    }
}