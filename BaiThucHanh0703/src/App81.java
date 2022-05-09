
import java.util.Scanner;
/**
 *
 * @author Admin
 */

public class App81 {
    private static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      System.out.println("Nhập vào số dòng của ma trận: ");
      int  n = sc.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
       int m = sc.nextInt(); 
       int[][] A = new int[n][m];
        for (int i = 0; i < n; i++){
            for(int j = 0 ; j < m; j++){
               System.out.print("A[" + i + "]["+ j + "]= ");
                 A[i][j] = sc.nextInt();
    }
}
       int max = A[0][0];

        for (int i = 0; i < m; i++) {
         for (int j = 0; j < n; j++) {

              if (max < A[i][j]) {

               max = A[i][j];

                } 

             } 
         System.out.println("Phần tử lớn nhất trong ma trận = " + max);
        }
}
}
