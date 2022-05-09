

import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class AppBai3 {
     private static Scanner a = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Nhap ten ");
        String ten = a.nextLine();
        System.out.print("Nhap nam  ");
        int nam = a.nextInt();
            if(2022-nam<16){
                System.out.println("Ban " + ten + " dang o do tuoi vi thanh nien");
            }
            else if(2022-nam>=16 && 2022-nam<18){
                System.out.println("Ban " + ten + " dang o do tuoi truong thanh");
            }
            else
                System.out.println("ban " + ten + " da gia");
        
    }
}
