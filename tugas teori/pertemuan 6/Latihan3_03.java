import java.util.Scanner;
public class Latihan3_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ukuran, harga;
        String merk, kategori;

        System.out.print("Masukkan Merk Sepatu (Converse/Sketcher/Nike): ");
        merk = sc.nextLine().trim();

        System.out.print("Masukkan Kategori Sepatu: ");
        kategori = sc.nextLine().trim();

        System.out.print("Masukkan Ukuran Sepatu: ");
        ukuran = sc.nextInt();
        harga = 0;

        if (merk.equals("Converse")) {
            if (kategori.equals("Slip On")) {
                harga = 800000;
            } else {
                if (kategori.equals("High Top")) {
                    harga = 1200000;
                } else {
                    System.out.println("Kategori tidak valid untuk Converse");
                }
            }
        } else {
            if (merk.equals("Sketcher")) {
                if (kategori.equals("Woman")) {
                    harga = 1000000;
                } else {
                    if (kategori.equals("Man")) {
                        harga = 1800000;
                    } else {
                        System.out.println("Kategori tidak valid untuk Sketcher");
                    }
                }
            } else {
                if (merk.equals("Nike")) {
                    if (kategori.equals("Kids")) {
                        harga = 750000;
                    } else {
                        if (kategori.equals("Adult")) {
                            harga = 1500000;
                        } else {
                            System.out.println("Kategori tidak valid untuk Nike");
                        }
                    }
                } else {
                    System.out.println("Merk sepatu tidak ditemukan");
                }
            }
        }
        if (harga > 0) {
            System.out.println("Merk    : " + merk);
            System.out.println("Kategori: " + kategori);
            System.out.println("Ukuran  : " + ukuran);
            System.out.println("Harga   : Rp " + harga);
        }

        sc.close();
    }
}