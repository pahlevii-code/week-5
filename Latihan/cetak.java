import java.util.Scanner;
public class cetak {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.println("\n==== 2 . Positif / negatif / Nol ====");
        System.out.print("Masukkan angka : ");
        int angka = in.nextInt();
        if (angka > 0) {
            System.out.println(angka + " adalah angka Positif");
        } else if (angka < 0) {
            System.out.println(angka + " adalah angka Negatif");
        } else {
            System.out.println("Angka = NOL");
        }
           System.out.println("Hasil cetak : " + angka);
        in.close();
    }
}
