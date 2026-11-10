import java.util.Scanner;

public class latihan {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.println("==== 1 . Cek Genap / Ganjil ====");
        System.out.print("Masukkan angka : ");
        int angka1 = in.nextInt();
        if (angka1 % 2 == 0){
            System.out.println(angka1 + " adalah angka Genap");
        } else {
            System.out.println(angka1 + " adalah angka Ganjil");
        }
        in.close();
    }
}