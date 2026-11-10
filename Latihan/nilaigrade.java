import java.util.Scanner;
public class nilaigrade {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan nilai : ");
        int nilai = in.nextInt();
        String grade;
        if (nilai >= 90){
            grade = "A";
        } else if (nilai >= 75){
            grade = "B";
        } else if (nilai >= 60){
            grade = "C";
        } else grade = "D";
        
        String status = (nilai >= 55) ? "Lulus" : "Tidak Lulus";
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);
        in.close();
    }
}
