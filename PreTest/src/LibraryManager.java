class RincianDenda {
    private int hariTerlambat;
    private double totalDenda;

    public RincianDenda(int hariTerlambat, double totalDenda) {
        this.hariTerlambat = hariTerlambat;
        this.totalDenda = totalDenda;
    }
    public int getHariTerlambat() { 
        return hariTerlambat; 
    }
    public double getTotalDenda() { 
        return totalDenda; 
    }
}

interface PenghitungDenda {
    double hitung(int hariTerlambat);
}

interface PencetakStruk {
    String buatStruk(RincianDenda rincian);
}

class PenghitungDendaStandar implements PenghitungDenda {
    @Override
    public double hitung(int hariTerlambat) {
        return hariTerlambat * 2000.0;
    }
}

class StrukTeksBiasa implements PencetakStruk {
    @Override
    public String buatStruk(RincianDenda rincian) {
        return "Terlambat: " + rincian.getHariTerlambat() + 
               " hari. Total Denda: Rp" + rincian.getTotalDenda();
    }
}

class StrukBentukTabel implements PencetakStruk {
    @Override
    public String buatStruk(RincianDenda rincian) {
        return "Hari Terlambat: " + rincian.getHariTerlambat() + "\n" + "Total Denda: Rp" + rincian.getTotalDenda();
    }
}

class LayananPengembalian {
    private PenghitungDenda penghitung;
    private PencetakStruk pencetak;

    public LayananPengembalian(PenghitungDenda penghitung, PencetakStruk pencetak) {
        this.penghitung = penghitung;
        this.pencetak = pencetak;
    }

    public void prosesPengembalian(String namaPeminjam, int hariTerlambat) {
        System.out.println("Memproses pengembalian buku atas nama: " + namaPeminjam);
        
        if (hariTerlambat <= 0) {
            System.out.println("Tepat waktu. Tidak ada denda.\n");
            return;
        }

        double denda = penghitung.hitung(hariTerlambat);
        RincianDenda rincian = new RincianDenda(hariTerlambat, denda);

        System.out.println(pencetak.buatStruk(rincian));
        System.out.println();
    }
}

