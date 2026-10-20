import java.util.Scanner;
public class Latihan2_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jamKerja;
        double gajiHarian;
        double bonus;
    
        while (true) {
            System.out.print("Masukkan jumlah jam kerja per hari: ");
            jamKerja = sc.nextDouble();
            
            if (jamKerja < 0) {
                System.out.println("Program selesai.");
                break;
            }
            
            System.out.print("Masukkan gaji harian pegawai: ");
            gajiHarian = sc.nextDouble();
            
            bonus = 0;
            
            if (jamKerja > 8) {
                bonus = 0.20 * gajiHarian;
            }
            
            System.out.println("Bonus yang diterima pegawai: " + bonus);
            System.out.println("----------------------------------------");
        }
        
        sc.close();
    }
}