public class Main {
    public static void main(String[] args) {
        krsValidator validator = new krsValidator();
        krsPdfPrinter pdfPrinter = new krsPdfPrinter();
        krsRepository database = new CloudNoSQLConnection();

        krsService krsSer = new krsService(database, validator, pdfPrinter);

        System.out.println("--- Proses KRS Mahasiswa A (MBKM) ---");
        krsSer.prosesKRS("MHS-001", new MataKuliahTeori(), new uktMbkm());

        System.out.println("\n--- Proses KRS Mahasiswa B (Reguler) ---");
        krsSer.prosesKRS("MHS-002", new MataKuliahPraktikum(), new uktReguler());

        System.out.println("\n--- Proses KRS Mahasiswa C (Bidikmisi) ---");
        krsSer.prosesKRS("MHS-003", new MataKuliahKKN(), new uktBidikmisi());

        System.out.println("\n--- Proses KRS Mahasiswa D (Karyawan) ---");
        krsSer.prosesKRS("MHS-004", new MataKuliahTeori(), new uktKaryawan());

        System.out.println("\n--- Proses KRS Mahasiswa E (Internasional) ---");
        krsSer.prosesKRS("MHS-005", new MataKuliahTeori(), new uktInternasional());
    }
}
