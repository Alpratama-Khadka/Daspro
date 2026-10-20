import java.util.Scanner;
public class Latihan1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalJam = 0;
        double jamBelajar;
        int hari = 1;

        while (hari <= 7) {
            System.out.print("Masukkan jam belajar hari ke-" + hari + ": ");
            jamBelajar = sc.nextDouble();

            
            if (jamBelajar > 10 || jamBelajar < 0) {
                System.out.println("Input tidak valid! Lebih dari 10 jam diabaikan, silakan input ulang.");
                continue;
            }

            totalJam += jamBelajar;
            hari++;
        }

        System.out.println("---------------------------------------------");
        System.out.println("Total jam belajar selama seminggu: " + totalJam + " jam.");
        
        sc.close();
    }
}

    