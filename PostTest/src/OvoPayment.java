class OvoPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("[OVO]\t\t Memanggil API OVO untuk pembayaran sebesar Rp" + amount);
    }
}