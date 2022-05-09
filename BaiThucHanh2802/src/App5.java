package App1;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class App5 {
    private static final Scanner s = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0, a;
    System.out.println("\n\nNhập vào số cần kiểm tra: ");
    a = s.nextInt();
    for(int i=1;i<=a/2;i++){
      if(a%i==0) 
        sum+=i;
    }
    if(sum==a){
      System.out.println(a + " là số hoàn hảo");
    }
    else {
      System.out.println(a + " không phải là số hoàn hảo");
    }
    }
}
