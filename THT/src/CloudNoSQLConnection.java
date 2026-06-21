public class CloudNoSQLConnection implements krsRepository {
    @Override
    public void simpanDataKRS(String idMahasiswa, Object dataKRS) {
        System.out.println("Menyimpan ke infrastruktur Cloud NoSQL secara asinkron agar tidak down...");
    }
}