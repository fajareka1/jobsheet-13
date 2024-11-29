import java.util.Scanner;

public class Kubus04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }

    public static int Volume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    public static int Permukaan(int sisi){
        int permukaan = 6 * (sisi * sisi);
        return permukaan;
    }
}
