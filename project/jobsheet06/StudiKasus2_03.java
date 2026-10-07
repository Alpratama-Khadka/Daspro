
import java.util.Scanner;
public class StudiKasus2_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPendanaan;

        System.out.print("Nama mahasiswa\t: ");
        nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINYA) : ");
        jenisKegiatan = sc.nextLine().trim();

        System.out.print("Jumlah dokumen\t: ");
        jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("belmawa") || jenisKegiatan.equalsIgnoreCase("bakorma")
                || jenisKegiatan.equalsIgnoreCase("mandiri")) {

            System.out.print("Peringkat juara\t: ");
            peringkatJuara = sc.nextInt();

            if (peringkatJuara == 1 || peringkatJuara == 2 || peringkatJuara == 3) {

                if (jumlahDokumen >= 4) {
                    System.out.println("Dana penghargaan diberikan kepada " + nama);
                } else {
                    jumlahDokumen = 4 - jumlahDokumen;
                    System.out.println("Dokumen tidak lengkap (kurang " + jumlahDokumen
                            + " dokumen). Dana penghargaan tidak diberikan");
                }

            } else {
                System.out.println("Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3). ");
            }

        } 
    }
}