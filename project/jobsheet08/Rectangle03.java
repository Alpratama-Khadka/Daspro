import java.util.Scanner;
public class Rectangle03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();
        for (int i = 1; i <= baris; i++)  {   //ini outer loop baris ya
         for (int j = 1; j <= kolom; j++) {  //ini outer loop kolom ya
            System.out.print("#");
            
         }
         System.out.println();               //untuk mindah baris 
        } 
        sc.close();
    }
}
