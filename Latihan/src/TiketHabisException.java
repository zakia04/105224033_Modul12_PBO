public class TiketHabisException extends Exception {
    String namaKereta;
    int sisaKursi;
    public TiketHabisException (String namakereta, int sisaKursi) {
        super("Tiket Kereta " + namakereta + " habis. Sisa kursi: " + sisaKursi);
        this.namaKereta = namakereta;
        this.sisaKursi = sisaKursi;
    } 
}
