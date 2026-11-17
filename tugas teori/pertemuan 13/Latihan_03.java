import java.util.Scanner;

public class Latihan_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survei = new int[10][6];
        int totalKeseluruhan = 0;

        System.out.println("=== Input Hasil Survei (Nilai 1-5) ===");
        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden ke-" + (i + 1) + ":");
            for (int j = 0; j < survei[i].length; j++) {
                int nilai;
                while (true) {
                    System.out.print("  Pertanyaan " + (j + 1) + ": ");
                    nilai = sc.nextInt();
                    if (nilai >= 1 && nilai <= 5) {
                        break;
                    }
                    System.out.println("  Input tidak valid! Masukkan angka 1 sampai 5.");
                }
                survei[i][j] = nilai;
                totalKeseluruhan += nilai;
            }
        }

        System.out.println("\n=== Rata-Rata Setiap Responden ===");
        for (int i = 0; i < survei.length; i++) {
            int totalResponden = 0;
            for (int j = 0; j < survei[i].length; j++) {
                totalResponden += survei[i][j];
            }
            double rataResponden = (double) totalResponden / survei[i].length;
            System.out.println("Responden ke-" + (i + 1) + " : " + rataResponden);
        }

        System.out.println("\n=== Rata-Rata Setiap Pertanyaan ===");
        for (int j = 0; j < survei[0].length; j++) {
            int totalPertanyaan = 0;
            for (int i = 0; i < survei.length; i++) {
                totalPertanyaan += survei[i][j];
            }
            double rataPertanyaan = (double) totalPertanyaan / survei.length;
            System.out.println("Pertanyaan ke-" + (j + 1) + " : " + rataPertanyaan);
        }

        System.out.println("\n=== Rata-Rata Keseluruhan ===");
        int jumlahData = survei.length * survei[0].length;
        double rataKeseluruhan = (double) totalKeseluruhan / jumlahData;
        System.out.println("Rata-rata keseluruhan : " + rataKeseluruhan);

        sc.close();
    }
}