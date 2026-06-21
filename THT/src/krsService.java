public class krsService {
    private krsRepository repository;
    private krsValidator validator;
    private krsPdfPrinter pdfPrinter;

    public krsService(krsRepository repository, krsValidator validator, krsPdfPrinter pdfPrinter) {
        this.repository = repository;
        this.validator = validator;
        this.pdfPrinter = pdfPrinter;
    }

    public void prosesKRS(String idMahasiswa, MataKuliah mk, StrategiKalkulasiUKT tipeUKT) {
        if (!validator.validasiPrasyarat(idMahasiswa, mk)) {
            throw new RuntimeException("Prasyarat tidak terpenuhi!");
        }

        double tagihan = tipeUKT.hitungUKT(mk.getSks());
        System.out.println("Tagihan UKT: Rp " + tagihan);

        repository.simpanDataKRS(idMahasiswa, mk);

        pdfPrinter.cetakDrafPDF(idMahasiswa);
    }
}

