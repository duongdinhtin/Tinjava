

import java. util.Scanner;
/**
 *
 * @author Admin
 */
public class AppBai12 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
                int m, n;
        System.out.println("Nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = scanner.nextInt();

        int A[][] = new int[m][n];
        scanner.close();

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }

        }

        int max = A[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
        
    }
}
