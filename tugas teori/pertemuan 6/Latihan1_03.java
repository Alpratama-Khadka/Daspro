import java.util.Scanner;
public class Latihan1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1;
        int bil2;
        int bil3;

        System.out.print("Masukkan bil1: ");
        bil1 = sc.nextInt();
        System.out.print("Masukkan bil2: ");
        bil2 = sc.nextInt();
        System.out.print("Masukkan bil3: ");
        bil3 = sc.nextInt();
        int terbesar;

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                terbesar = bil1;
            } else {
                terbesar = bil3;
            }
        } else {
            if (bil2 > bil3) {
                terbesar = bil2;
            } else {
                terbesar = bil3;
            }
        }
        System.out.println("bilangan terbesar : " + terbesar);

        sc.close();
    }
}
    

