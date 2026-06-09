public class Main {
    public static void main(String[] args) {
        System.out.println("=== SKENARIO 1: STRUK TEKS ===");
        LayananPengembalian layananTeks = new LayananPengembalian(
            new PenghitungDendaStandar(), 
            new StrukTeksBiasa()
        );
        layananTeks.prosesPengembalian("Zakia", 3);

        System.out.println("=== SKENARIO 2: STRUK TABEL ===");
        LayananPengembalian layananTabel = new LayananPengembalian(
            new PenghitungDendaStandar(), 
            new StrukBentukTabel()
        );
        layananTabel.prosesPengembalian("Budi", 5);
    }
}