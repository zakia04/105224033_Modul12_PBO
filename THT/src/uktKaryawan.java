public class uktKaryawan implements StrategiKalkulasiUKT {
    @Override
    public double hitungUKT(int jumlahSks) {
        return jumlahSks * 200000;
    }
}
