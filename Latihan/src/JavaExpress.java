import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExpress {
    public static void main(String[] args) {
        KeretaRepository repo = new PenyimpananDataKereta();
        ReservasiService resService = new ReservasiService(repo);
        
        Scanner input = new Scanner(System.in);
        boolean jalan = true;
        
        System.out.println("Selamat datang di Java Express");
        try {
            while (jalan) {
                System.out.println("1. Lihat Jadwal Kereta");
                System.out.println("2. Pesan Tiket");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu: ");
                
                int pilihan;
                try {
                    pilihan = input.nextInt();
                    input.nextLine(); 
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Silakan masukkan angka 1-3!");
                    input.nextLine(); 
                    continue;
                }

                switch (pilihan) {
                    case 1:
                        resService.tampilkanJadwal();
                        System.out.print("\n");
                        break;
                    case 2:
                        System.out.print("Masukkan kode kereta: ");
                        String kodeKereta = input.nextLine();
                        System.out.print("Masukkan NIK: ");
                        String nik = input.nextLine();
                        System.out.print("Masukkan nama penumpang: ");
                        String namaPenumpang = input.nextLine();
                        System.out.print("Masukkan jumlah tiket: ");
                        
                        int jumlah;
                        try {
                            jumlah = Integer.parseInt(input.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Input tidak valid. Silakan masukkan angka.");
                            break;
                        }
                        
                        try {
                            resService.pesenTiket(kodeKereta, nik, namaPenumpang, jumlah);
                        } catch (DataPenumpangTidakValidException | RuteTidakDitemukanException | TiketHabisException e) {
                            System.out.println("ERROR: " + e.getMessage());
                        }
                        System.out.print("\n");
                        break;
                    case 3:
                        jalan = false;
                        System.out.println("Terima kasih telah menggunakan Java Express!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            }
        } finally {
            System.out.println("Program selesai.");
            input.close();
        }
    }
}