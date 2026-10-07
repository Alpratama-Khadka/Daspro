import java.util.Scanner;

public class TugasParkir03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan lama parkir anda (jam): ");
        int lamaParkir = sc.nextInt();

        int tarif1 = 2000;
        int tarif2 = 1000;
        int total;

        if (lamaParkir <= 2) {
            total = tarif1;
        } else {
            total = (lamaParkir - 2) * tarif2 + tarif1;
        }

        System.out.println("Tarif parkir anda: " + total);

        sc.close();
    }
}
