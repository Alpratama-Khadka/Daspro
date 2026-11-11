import java.util.Arrays;
import java.util.Scanner;

public class SearchNilai03_pertanyaan2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int jumlahElemen;
            do {
                System.out.print("Masukkan banyaknya elemen array: ");
                jumlahElemen = scanner.nextInt();
                if (jumlahElemen <= 0) {
                    System.out.println("Banyaknya elemen harus lebih dari 0.");
                }
            } while (jumlahElemen <= 0);

            int[] nilai = new int[jumlahElemen];
            for (int i = 0; i < nilai.length; i++) {
                System.out.print("Masukkan nilai untuk indeks " + i + ": ");
                nilai[i] = scanner.nextInt();
            }

            System.out.print("Masukkan nilai yang ingin dicari: ");
            int key = scanner.nextInt();
            int indeks = -1;

            for (int i = 0; i < nilai.length; i++) {
                if (nilai[i] == key) {
                    indeks = i;
                    break;
                }
            }
        

            if (indeks >= 0) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + indeks);
            } else {
                System.out.println("Nilai yang dicari (" + key + ") tidak ditemukan di dalam array "
                        + Arrays.toString(nilai) + ".");
            }
        }
    }
}