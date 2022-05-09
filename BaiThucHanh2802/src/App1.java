
package App1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class App1 {
    private static Scanner scanner =  new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       System.out.print ("nhap vào 1 số nguyên dương: ");
       int a = scanner.nextInt();
       System.out.print("nhap vào 1 số nguyên dương: ");
        int b = scanner.nextInt();
      System.out.println("USCLN của "+ a +" và "+ b +" là: "+USCLN(a,b));
    }
     public static int USCLN(int a, int b){
         
       while (a!=b){
           if(a>b){
               a-=b;
           }
           else{
               b-=a;
           }
     }
       int USCLN=a;
       return USCLN;
       
     } 
    }
    

