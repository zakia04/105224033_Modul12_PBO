public class MataKuliahPraktikum implements MataKuliah, OperasiPraktikum {
    @Override
    public String getNamaMataKuliah() { 
        return "Praktikum Algoritma"; 
    }
    @Override
    public int getSks() { 
        return 1; 
    }
    @Override
    public void alokasiAsistenLab() {
        System.out.println("Mengalokasikan asisten lab");
    }
    @Override
    public void cekPeralatanPraktikum() {
        System.out.println("Mengecek PC dan server lab");
    }      
}