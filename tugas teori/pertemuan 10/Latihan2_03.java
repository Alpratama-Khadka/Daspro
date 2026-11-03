public class Latihan2_03 {
    public static void main(String[] args) {

        int baris = 5;
        char huruf = 'A';
        for (int i = 0; i <= baris; i++) {
            for (int j = 0; j < baris - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print(huruf);
                huruf++;
            }
            System.out.println();
        }
    }
}