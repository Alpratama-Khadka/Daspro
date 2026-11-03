import java.util.Scanner;

public class Latihan4_03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int rata, total, jumlahperproduk, totsem = 0;
        int i = 1;

        System.out.print("Masukkan Jumlah Produk = ");
        int jumlahproduk = sc.nextInt();
        System.out.print("Masukkan Jumlah Hari = ");
        int jumlahhari = sc.nextInt();

        while (i <= jumlahhari) {
            System.out.println("Hari " + i);
            jumlahperproduk = 0;
            total = 0;
            rata = 0;
            
            for (int j = 1; j <= jumlahproduk; j++) {
                
                do {
                    System.out.print("Masukkan Jumlah Produk " + j + " = ");
                    jumlahperproduk = sc.nextInt();
                    
                    if (jumlahperproduk < 0) {
                        System.out.println("Angka Tidak Boleh Negatif, Masukkan Ulang!");
                    }
                } while (jumlahperproduk < 0); 

                total += jumlahperproduk;
            }

            rata = total / jumlahproduk;
            totsem += total;
            
            System.out.println("Total Produk Harian = " + total);
            System.out.println("Rata Rata = " + rata);
            i++;

        }
        
        System.out.println("Total Seluruh = " + totsem);
        sc.close();
    }
}