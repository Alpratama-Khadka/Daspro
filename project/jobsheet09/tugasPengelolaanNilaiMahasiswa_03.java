import java.util.Scanner;

public class tugasPengelolaanNilaiMahasiswa_03 {
    static final int NILAI_LULUS = 60;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Masukkan banyaknya nilai mahasiswa: ");
            n = input.nextInt();
            if (n <= 0) {
                System.out.println("Jumlah harus lebih dari 0!");
            }
        } while (n <= 0);

        int[] nilai = new int[n];

       
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

    
        int total = 0;
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 0; i < n; i++) {
            total += nilai[i];
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        
        double rataRata = (double) total / n;

        
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        }
        
    
        
    }
