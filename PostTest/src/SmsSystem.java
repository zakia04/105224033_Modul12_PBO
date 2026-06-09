class SmsSystem implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("[SMS]\t\t " + message);
    }
}
