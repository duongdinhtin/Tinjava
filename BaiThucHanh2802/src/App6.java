
package App1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */

public class App6 {
    
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.print("Nhập vào 1 số : ");
        int n = s.nextInt();
        while(n <= 0);
              for( int i = 2; i <= n; i++)
             {
             int sum = 1;
                for(int j = 2; j <= i/2; j++)
                 {
                  if(i%j == 0)
                   sum += j;
                }
             if(sum == i)
            System.out.println("\n " +i);
    }
    }
}
