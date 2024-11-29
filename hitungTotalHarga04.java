import java.util.Scanner;

public class hitungTotalHarga04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah pesanan: ");
        int banyakItem = sc.nextInt();
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.next();

        int total = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        if (total == -1) {
            System.out.println("Kode promo tidak valid!");
        } else {
            System.out.println("Total harga setelah diskon: Rp " + total);
        }
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        if (pilihanMenu < 1 || pilihanMenu > hargaItems.length) {
            System.out.println("Nomor menu tidak valid!");
            return 0;
        }

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal *= 0.5;
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal *= 0.7;
        } else if (!kodePromo.equals("-")) {
            return -1;
        }

        return hargaTotal;
    }
}
