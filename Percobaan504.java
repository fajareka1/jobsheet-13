import java.util.Scanner;

public class Percobaan504 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int p, l, t, luas, volume;
        System.out.print("Masukkan panjang\t : ");
        p = sc.nextInt();
        System.out.print("Masukkan lebar\t : ");
        l = sc.nextInt();
        System.out.print("Masukkan tinggi\t : ");
        t = sc.nextInt();

        luas = hitungLuas(p, l);
        volume = hitungVolume(p, l, t);

        System.out.println("Luas perge panjang adalah "+ luas);
        System.out.println("Volume perge panjang adalah "+ volume   );

        
    }

    static int hitungLuas (int pjg, int lbr) {
        int luas = pjg * lbr;
        return luas;
    }

    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
}
