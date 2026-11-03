
public class Latihan3_03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int jumlahKuadrat = 0;
            System.out.print("n = " + i + " > jumlah kuadrat = ");
            
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    jumlahKuadrat += j * j;
                    System.out.print(j * j);
                    continue;
                }
                jumlahKuadrat += j * j;
                System.out.print(" + " + j * j);
            }
            if (i == 1) {
                System.out.println();
                continue;
            }
            System.out.print(" = " + jumlahKuadrat);
            System.out.println();
        }
    }
}