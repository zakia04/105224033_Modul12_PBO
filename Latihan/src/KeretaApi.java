public class KeretaApi {
    String kodeKereta;
    String namaKereta;
    String rutePerjalanan;
    int sisaKursi;
    public KeretaApi(String kodeKereta, String namaKereta, String rutePerjalanan, int sisaKursi) {
        this.kodeKereta = kodeKereta;
        this.namaKereta = namaKereta;
        this.rutePerjalanan = rutePerjalanan;
        this.sisaKursi = sisaKursi;
    }
    public String toString() {
        return kodeKereta + " | " + namaKereta + " | " + rutePerjalanan + " | Sisa kursi: " + sisaKursi;
    } 
}