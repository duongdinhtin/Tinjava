
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class AppBai1 {

    private static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.print("nhập vào 1 số  dương a : ");
         float a = scanner.nextFloat();
      System.out.print("nhập vào 1 số  dương b : ");
         float b = scanner.nextFloat();
        float tong=a+b;
        float hieu;
            if(a>b)
                hieu=a-b;
            else
                hieu=b-a;
        float tich ;float  ms,ts;
            ts=a;
            ms=b;
           if(ms==0){
               System.out.print("không thực hiện được phép tính");
           }
           else{
               tich = ts/ms;
               System.out.println("tích của 2 số là : " + tich); 
           }
           float thuong;
            thuong=a*b;
          
       System.out.println("tổng của 2 số là :" + tong);
       System.out.println("Hiệu của 2 số là : " + hieu);
       System.out.println("thương của 2 số là : " + thuong);
       
         
    }
    }
    

