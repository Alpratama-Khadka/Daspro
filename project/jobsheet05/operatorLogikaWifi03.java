import java.util.Scanner;
public class operatorLogikaWifi03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean mahasiswa, dosen, akunDiblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();

        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = sc.nextBoolean();

        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = sc.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.print("Akses Wifi diberikan");
        } else {
            System.out.print("Akses Wifi ditolak");
        }
    }
    
}
