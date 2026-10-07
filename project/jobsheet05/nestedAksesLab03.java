import java.util.Scanner;
public class nestedAksesLab03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif, sedangDisanksi, punyaIzinDosen, asistenLab;
        
        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();

        System.out.print("Apakah Mahasiswa di sanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();

        System.out.print("Apakah mempunyai Izin Dosen? (true/false): ");
        punyaIzinDosen = sc.nextBoolean();

        System.out.print("Apakah Mahasiswa asisten Lab? (true/false): ");
        asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
    
}
