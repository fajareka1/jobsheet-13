public class Kafe04 {

    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50");
    }

    public static void Menu(String namePelanggan, Boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namePelanggan + " !");
        
        if (isMember) {
            System.out.println("Anda adalah member");
        }
        
        System.out.println("===== Menu Resto Kafe =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo tidak valid");
        }

        System.out.println("Silahkan pilih menu yang anda inginkan");
    }
}
