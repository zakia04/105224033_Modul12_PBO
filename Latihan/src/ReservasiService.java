//DIP
import java.util.List;

public class ReservasiService implements KurangiKursi {
    private KeretaRepository repository;
    private KeretaApi keretaTerpilih;
    public ReservasiService(KeretaRepository repository) {
        this.repository = repository;
    }
    public void tampilkanJadwal() {
        List<KeretaApi> daftarKereta = repository.AllKereta();
        for (KeretaApi k : daftarKereta) {
            System.out.println(k);
        }
    }
    @Override
    public void kurangiKursi(int jumlah) {
        if (keretaTerpilih != null) {
            keretaTerpilih.sisaKursi -= jumlah;
        }
    }
    public void pesenTiket(String kodeKereta, String nik, String namaPenumpang, int jumlah) 
        throws DataPenumpangTidakValidException, TiketHabisException, RuteTidakDitemukanException {
        if (nik.length() != 16) {
            throw new DataPenumpangTidakValidException("NIK harus 16 karakter");
        }
        for (char c : nik.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new DataPenumpangTidakValidException("NIK harus berupa angka");
            }
        }
        KeretaApi keretaPilihan = repository.cariKode(kodeKereta);
        if (keretaPilihan == null) {
            throw new RuteTidakDitemukanException("Rute tidak ditemukan");
        }
        if (keretaPilihan.sisaKursi < jumlah) {
            throw new TiketHabisException(keretaPilihan.namaKereta, keretaPilihan.sisaKursi);    
        }    
        this.keretaTerpilih = keretaPilihan;
        this.kurangiKursi(jumlah);
        repository.updateKereta(keretaPilihan);
        System.out.println("\n==== Pemesanan Tiket Berhasil ====");
        System.out.println("Nama: " + namaPenumpang);
        System.out.println("NIK: " + nik);
        System.out.println("Kereta " + keretaPilihan.namaKereta + ": " + keretaPilihan.rutePerjalanan);
        System.out.println("Jumlah Tiket: " + jumlah);
    }
}
