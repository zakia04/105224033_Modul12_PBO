class WhatsAppSystem implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("[WhatsApp]\t " + message);
    }
}