import java.util.Scanner;

public class App4 {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
       System.out.print("Nhap vao 1 so : ");
       int n = scanner.nextInt();
       System.out.printf("Tat ca cac so nguyen to nho hon %d la: \n", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (SNT(i)) {
                System.out.print(" " + i);
            }
        }
    }
     public static boolean SNT(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
