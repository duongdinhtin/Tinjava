import java.util.Scanner;
/**
 *
 * @author Admin
 */

public class App10 {
    
    /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("nhập vào 1 số nguyên");
       int a = s.nextInt();
       int dem=0;
       while(a>0)
       {
           dem++;
           a=a/10;
       }
       
       System.out.println("so vua nhap co "+dem+" chu so");
   }
}
