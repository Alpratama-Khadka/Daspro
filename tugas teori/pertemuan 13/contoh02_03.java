import java.util.Scanner;

public class contoh02_03 {
    public static void main(String[] args) {
        String[] kota = {"Tokyo", "Osaka", "Sapporo", "Fukuoka", "Naha"};
        double[][] suhu = new double[5][7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < suhu.length; i++) {
            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print(kota[i] + " hari " + (j + 1) + ": ");
                suhu[i][j] = sc.nextDouble();
            }
        }

        double suhuTerendah = suhu[0][0];
        int kotaMin = 0;
        int hariMin = 0;

        double suhuTertinggi = suhu[0][0];
        int kotaMax = 0;
        int hariMax = 0;

        for (int i = 0; i < suhu.length; i++) {
            for (int j = 0; j < suhu[i].length; j++) {
                if (suhu[i][j] < suhuTerendah) {
                    suhuTerendah = suhu[i][j];
                    kotaMin = i;
                    hariMin = j;
                }

                if (suhu[i][j] > suhuTertinggi) {
                    suhuTertinggi = suhu[i][j];
                    kotaMax = i;
                    hariMax = j;
                }
            }
        }

        System.out.println("\n=== Hasil Analisis Suhu ===");
        System.out.println("Suhu terendah  : " + suhuTerendah + "°C (Terjadi di " + kota[kotaMin] + " pada hari ke-" + (hariMin + 1) + ")");
        System.out.println("Suhu tertinggi : " + suhuTertinggi + "°C (Terjadi di " + kota[kotaMax] + " pada hari ke-" + (hariMax + 1) + ")");

        sc.close();
    }
}
