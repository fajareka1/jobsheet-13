import java.util.Scanner;

public class CafeTugas4 {
    static String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu"};
    static String[] menu = {"Kopi\t", "Teh\t", "Es Degan", "Roti Bakar", "Gorengan"};
    static int[][] data =  new int[menu.length][hari.length];

    public static void main(String[] args) {
        Input();
        View();
        MostSell();
        Average();
        
    }

    public static void Input() {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < data.length; i++) {
            System.out.println("Maukkan data menu " + menu[i]);
            for(int j = 0; j < data[0].length; j++) {
                System.out.print("Hari " + hari[j] + " : ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    public static void View() {
        for(int i = -1; i < hari.length; i++){
            if(i == -1){
                System.out.print("\t\t");
            }else{
                System.out.print("\t" + hari[i]);
            }
        }

        System.out.println();

        for(int i = 0; i < data.length; i++){
            for(int j = -1; j < data[0].length; j++) {
                if(j == -1){
                    System.out.print(menu[i] + "\t : ");
                }else{
                    System.out.print("\t" + data[i][j]);
                }
            }

            System.out.println();
        }

    }

    public static void Average() {
        int total;
        double rata;
        for(int i = 0; i < data.length; i++){
            total = 0;
            for(int j = 0; j < data[0].length; j++){
                total = total + data[i][j];
            }
            System.out.println("Rata rata penjualan dari menu "+ menu[i] + " adalah : " + (total/7));
        }
    }

    public static void MostSell() {
        int max = 0, total, index = 0;
        for(int i = 0; i < data.length; i++){
            total = 0;
            for(int j = 0; j < data[0].length; j++){
                total = total + data[i][j];
            }
            if(total > max){
                max = total;
                index = i;
            }
        }

        System.out.println("Menu dengan penjualan tertinggin adalah "+ menu[index]);
    }
}