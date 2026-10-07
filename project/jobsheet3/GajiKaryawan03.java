import java.util.Scanner;
public class GajiKaryawan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajiPokok;
        double bonus;
        int totGaji;
        double tunjTransp = 600_000;
        double tunjMkn = 400_000;

        System.out.println(" Masukkan gaji pokok: ");
        gajiPokok = sc.nextInt();

        System.out.println("Masukkan bonus: ");
        bonus = 0.05 * gajiPokok;

        totGaji = (int) (gajiPokok + tunjTransp + tunjMkn + bonus - (0.1 * gajiPokok));

        System.out.println("Bonus Bulanan ana adalah Rp: " +bonus);
        System.out.println("Gaji yang diterima adalah Rp: " +totGaji);

        sc.close();
        
    }
}
