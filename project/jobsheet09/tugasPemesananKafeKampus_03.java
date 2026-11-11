import java.util.Scanner;

public class tugasPemesananKafeKampus_03 {

    static String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                            "Teh Tarik", "Cappucino", "Chocolate Ice"};
    static int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
    static int cariMenu(String nama) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(nama)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== DAFTAR MENU KAFE KAMPUS =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-16s Rp%,d%n", (i + 1), menu[i], harga[i]);
        }

        System.out.println("\n--- Cari Menu ---");
        System.out.print("Masukkan nama menu yang dicari: ");
        String cari = input.nextLine().trim();
        int idx = cariMenu(cari);
        if (idx != -1) {
            System.out.printf("Menu ditemukan: %s, harga Rp%,d%n", menu[idx], harga[idx]);
        } else {
            System.out.println("Maaf, menu \"" + cari + "\" tidak tersedia.");
        }

        System.out.println("\n--- Pemesanan ---");
        int jumlah;
        do {
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            jumlah = input.nextInt();
        } while (jumlah <= 0);
        input.nextLine(); 

        String[] pesanan = new String[jumlah]; 
        int[] hargaPesanan = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            int index;
            do {
                System.out.print("Nama menu pesanan ke-" + (i + 1) + ": ");
                String nama = input.nextLine().trim();
                index = cariMenu(nama);
                if (index == -1) {
                    System.out.println("Menu tidak tersedia, silakan masukkan ulang.");
                }
            } while (index == -1);

            pesanan[i] = menu[index];
            hargaPesanan[i] = harga[index];
        }

        int total = 0;
        for (int i = 0; i < jumlah; i++) {
            total += hargaPesanan[i];
        }

        System.out.println("\n=========== STRUK PESANAN ===========");
        System.out.printf("%-4s %-18s %12s%n", "No", "Menu", "Harga");
        System.out.println("-------------------------------------");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-4d %-18s %12s%n", (i + 1), pesanan[i],
                    String.format("Rp%,d", hargaPesanan[i]));
        }
        System.out.println("-------------------------------------");
        System.out.printf("%-23s %12s%n", "TOTAL BIAYA", String.format("Rp%,d", total));
        System.out.println("=====================================");

        input.close();
    }
}