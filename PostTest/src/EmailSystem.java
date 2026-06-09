class EmailSystem implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("[Email]\t\t " + message);
    }
}
