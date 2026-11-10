import java.util.Scanner;
 public class segitiga {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Sisi 1: ");
         double s1 = sc.nextDouble();
         System.out.print("Sisi 2: ");
         double s2 = sc.nextDouble();
         System.out.print("Sisi 3: ");
         double s3 = sc.nextDouble();
         if((s1+s2>s3) && (s1+s3>s2) && (s2+s3>s1)){
             if(s1 == s2 && s2 == s3){
                 System.out.println("Segitiga SAMA SISI");
             }else if(s1==s2 || s1==s3 || s2==s3){
                 System.out.println("Segitiga SAMA KAKI");
             }else{
                 System.out.println("Segitiga SEMBARANG");
             }
         }else{
             System.out.println("BUKAN Segitiga");
         }
         sc.close();
     }
 }
