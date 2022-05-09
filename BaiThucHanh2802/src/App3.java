import java.util.Scanner;
/**
 *
 * @author Admin
 */

public class App3 {
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Nhap vao 1 so : ");
       int n = s.nextInt();
       if (SNT(n)) {
           System.out.println(n + " la so nguyen to ");
       } else {
           System.out.println(n + " khong phai la si nguyen to");
       }
   }
    public static boolean SNT(int n) {
       if (n <= 1) {
           return false;
       }
       for (int i = 2; i <= Math.sqrt(n); i++) {
           if (n % i == 0) {
               return false;
           }
       }
       return true;
   }
}
