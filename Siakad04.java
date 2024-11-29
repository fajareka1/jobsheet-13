import java.util.Scanner;

public class Siakad04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mhs, tgs;
        System.out.print("Masukkan jumlah mahasiswa : ");
        mhs = sc.nextInt();
        System.out.print("Masukkan jumlah tugas : ");
        tgs = sc.nextInt();
        int[][] nilai =  new int[mhs][tgs];
        Input(nilai);
        View(nilai);
        MostSell(nilai);
        Average(nilai);
        
    }

    public static void Input(int nilai[][]) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < nilai.length; i++) {
            System.out.println("Maukkan nilai mahasiswa ke-" + (i+1));
            for(int j = 0; j < nilai[0].length; j++) {
                System.out.print("Tugas "+ (j+1) +": ");
                nilai[i][j] = sc.nextInt();
            }
        }
    }

    public static void View(int nilai[][]) {
        System.out.println();
        for(int i = -1; i < nilai[0].length; i++){
            if(i == -1){
                System.out.print("\t\t");
            }else{
                System.out.print("\tTgs-" + (i+1));
            }
        }

        System.out.println();

        for(int i = 0; i < nilai.length; i++){
            for(int j = -1; j < nilai[0].length; j++) {
                if(j == -1){
                    System.out.print("mahasiswa ke-"+ (i+1) +"\t : ");
                }else{
                    System.out.print("\t" + nilai[i][j]);
                }
            }

            System.out.println();
        }

    }

    public static void Average(int nilai[][]) {
        System.out.println();
        int total;
        for(int i = 0; i < nilai.length; i++){
            total = 0;
            for(int j = 0; j < nilai[0].length; j++){
                total = total + nilai[i][j];
            }
            System.out.println("Rata rata nilai dari mahasiswa ke-"+ (i + 1) + " adalah : " + (total/nilai[0].length));
        }
    }

    public static void MostSell(int nilai[][]) {
        int max = 0, total, index = 0;
        for(int i = 0; i < nilai.length; i++){
            total = 0;
            for(int j = 0; j < nilai[0].length; j++){
                total = total + nilai[i][j];
            }
            if(total > max){
                max = total;
                index = i;
            }
        }

        System.out.println("\nMahasiswa dengan nili tertinggi adalah mahasiswa ke-"+ (index+1));
    }
}