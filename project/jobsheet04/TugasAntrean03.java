import java.util.Scanner;

public class TugasAntrean03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Kode anda: ");
        int pelayanan = sc.nextInt();

        switch (pelayanan) {
            case 1:
                System.out.println("Legalisir Ijazah di Loket A");
                break;
            case 2:
                System.out.println("Surat Keterangan Lulus di Loket B");
                break;
            case 3:
                System.out.println("pembayaran UKT di Loket C");
                break;
            case 4:
                System.out.println("pengajuan Cuti Akademik di Loket D");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
                break;
        }

        sc.close();
    }
}
