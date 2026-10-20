import java.util.Scanner;

public class tugas01_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gajiPokok;
        int jumlahAnak;
        double tunjanganPerAnak = 100000;   // Rp100.000 per anak
        double persenPensiun = 0.10;        // potongan dana pensiun 10%
        double totalTunjangan;
        double potonganPensiun;
        double gajiBersih;

        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = input.nextDouble();

        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = input.nextInt();

        totalTunjangan = jumlahAnak * tunjanganPerAnak;
        potonganPensiun = persenPensiun * gajiPokok;
        gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        System.out.println("Total tunjangan anak : Rp" + totalTunjangan);
        System.out.println("Potongan pensiun     : Rp" + potonganPensiun);
        System.out.println("Gaji bersih Pak Danur: Rp" + gajiBersih);

    }
}