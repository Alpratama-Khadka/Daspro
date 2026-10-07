import java.util.Scanner;

public class Tugas1Pemilihan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD---");
        System.out.println("Apakah UKT sudah lunas? (true/false)");
        boolean uktLunas = sc.nextBoolean();

        String pesan = uktLunas ? "pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA" : "";

        System.out.println(pesan);

        sc.close();
    }
}
