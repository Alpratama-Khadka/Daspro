public class contoh01_03 {
    public static void main(String[] args) {
        int[][] penjualan = {
            {2, 8, 6},   
            {7, 3, 6},   
            {4, 6, 5}    
        };

        String[] cabang   = {"Dieng (0)", "Soehat (1)", "Sengkaling (2)"};
        String[] kategori = {"Novel (0)", "Komik (1)", "Ensiklopedia (2)"};

        int[] totalKategori = new int[kategori.length];
        int totalSemua = 0;

        System.out.printf("%-18s", "Cabang / Kategori");
        for (String k : kategori) {
            System.out.printf("%-18s", k);
        }
        System.out.printf("%-8s%-10s%n", "Total", "Rata-rata");
        System.out.println("-".repeat(90));

        for (int i = 0; i < penjualan.length; i++) {
            int totalCabang = 0;
            System.out.printf("%-18s", cabang[i]);

            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.printf("%-18d", penjualan[i][j]);
                totalCabang += penjualan[i][j];      
                totalKategori[j] += penjualan[i][j]; 
            }

            double rataCabang = (double) totalCabang / penjualan[i].length;
            System.out.printf("%-8d%-10.2f%n", totalCabang, rataCabang);
            totalSemua += totalCabang;
        }

        System.out.println("-".repeat(90));

        System.out.printf("%-18s", "Total");
        for (int j = 0; j < totalKategori.length; j++) {
            System.out.printf("%-18d", totalKategori[j]);
        }
        System.out.printf("%-8d%n", totalSemua);

        System.out.printf("%-18s", "Rata-rata");
        for (int j = 0; j < totalKategori.length; j++) {
            double rataKategori = (double) totalKategori[j] / penjualan.length;
            System.out.printf("%-18.2f", rataKategori);
        }
        double rataSemua = (double) totalSemua / (penjualan.length * kategori.length);
        System.out.printf("%-8s%-10.2f%n", "", rataSemua);

        System.out.println();
        System.out.println("penjualan[0][1] = " + penjualan[0][1]
                + " -> " + cabang[0] + ", " + kategori[1]);
    }
}