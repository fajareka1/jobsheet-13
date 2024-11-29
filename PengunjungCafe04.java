public class PengunjungCafe04 {
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }

    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar nama pengunjung : ");
        int i = 1;
        for (String nama : namaPengunjung) {
            System.out.println(i + ". " + nama);
            i++;
        }
    }
}
