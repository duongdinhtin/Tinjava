import java.util.Scanner;
public class App74 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so phan tu trong mang: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int total = 0;
        for(int i=0; i<arr.length; i++){
            System.out.print("Nhap vao gia tri cho phan tu thu "+(i+1)+": ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0)
            total = total + arr[i];
        }
        System.out.print(total);
    }
}