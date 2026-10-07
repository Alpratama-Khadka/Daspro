import java.util.Scanner;

public class tugas1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hargaLaptop, uangMuka, cicilanPerBulan, totalBayarPerBulan;
        int bulan;

        System.out.print("Masukan harga laptop: ");
        hargaLaptop = sc.nextDouble();

        System.out.print("Masukan uang muka: ");
        uangMuka = sc.nextDouble();

        System.out.print("Masukan jumlah bulan: ");
        bulan = sc.nextInt();

        double sisaHutang = hargaLaptop - uangMuka;
        double bungaPerBulan = sisaHutang * 0.02;
        cicilanPerBulan = sisaHutang / bulan;
        totalBayarPerBulan = cicilanPerBulan + bungaPerBulan;

        System.out.println("Harga bayar per bulan adalah : " + totalBayarPerBulan);

        sc.close();
    }
}