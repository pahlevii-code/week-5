import java.util.Scanner;
 public class kalkulator {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Angka 1: ");
         double a = sc.nextDouble();
         System.out.print("Angka 2: ");
         double b = sc.nextDouble();
         System.out.print("Operator (+‑*/%): ");
         char op = sc.next().charAt(0);
         double hasil = 0;
         boolean error = false;
         if((op == '/' || op == '%') && b == 0){
             System.out.println("ERROR: Tidak boleh dibagi / modulo NOL");
             error = true;
         }else{
             switch(op){
                 case '+': hasil = a + b; break;
                 case '-': hasil = a - b; break;
                 case '*': hasil = a * b; break;
                 case '/': hasil = a / b; break;
                 case '%': hasil = a % b; break;
                 default:
                     System.out.println("Operator Salah");
                     error = true;
             }
         }
         if(!error) System.out.println("Hasil = "+hasil);
         sc.close();
     }
 }