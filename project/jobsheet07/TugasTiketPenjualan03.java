import java.util.Scanner;

public class TugasTiketPenjualan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        int jumlahTiket;
        double totalPenjualanHarian = 0, hargaKotor, totalHarga;
        String lanjut = "";

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();

      
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan masukkan angka positif.\n");
                continue;
            }

            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            hargaKotor = jumlahTiket * hargaTiket;
            totalHarga = hargaKotor - (hargaKotor * diskon);

            totalTiketTerjual += jumlahTiket;
            totalPenjualanHarian += totalHarga;

            System.out.println("Total harga transaksi ini: Rp " + (long) totalHarga);
            
            System.out.print("Apakah ada transaksi pelanggan lain? (y/n): ");
            lanjut = sc.next();
            System.out.println();

        } while (!lanjut.equalsIgnoreCase("n"));

        System.out.println("======================================");
        System.out.println("Total Tiket Terjual : " + totalTiketTerjual);
        System.out.println("Total Hasil Penjualan: Rp " + (long) totalPenjualanHarian);
        
        sc.close();
    }
}