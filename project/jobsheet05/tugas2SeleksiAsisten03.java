import java.util.Scanner;

public class tugas2SeleksiAsisten03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String mahasiswaAktif, tidakKenaSanksi;
        double nilaiDaspro, nilaiWawancara;

        System.out.print("Apakah mahasiswa berstatus aktif? (ya/tidak): ");
        mahasiswaAktif = sc.nextLine();

        System.out.print("Apakah mahasiswa sedang mendapat sanksi akademik? (ya/tidak): ");
        tidakKenaSanksi = sc.nextLine();

        if (mahasiswaAktif.equalsIgnoreCase("ya") && tidakKenaSanksi.equalsIgnoreCase("tidak")) {

            System.out.print("Masukkan nilai Dasar Pemrograman: ");
            nilaiDaspro = sc.nextDouble();
            sc.nextLine();

            System.out.print("Apakah memiliki sertifikat kompetensi? (ya/tidak): ");
            String sertifikat = sc.nextLine();

            if (nilaiDaspro >= 80 || sertifikat.equalsIgnoreCase("ya")) {

                System.out.print("Masukkan nilai wawancara: ");
                nilaiWawancara = sc.nextDouble();

                if (nilaiWawancara >= 75) {
                    System.out.println("\nSelamat! Anda DITERIMA sebagai asisten praktikum.");
                } else {
                    System.out.println("\nGAGAL: Nilai wawancara kurang dari 75.");
                }

            } else {
                System.out.println("\nGAGAL: Nilai Dasar Pemrograman kurang dari 80 dan tidak ada sertifikat.");
            }

        } else {
            System.out.println("\nGAGAL: Mahasiswa tidak aktif atau sedang kena sanksi.");
        }

        sc.close();
    }
}