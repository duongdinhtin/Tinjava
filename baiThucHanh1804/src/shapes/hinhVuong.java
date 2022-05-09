package shapes;
import java.util.Scanner;
public class hinhVuong extends hinhChuNhat{
    public hinhVuong(){
        ten = "Hinh vuong";
    }
    public void hinhVuong() {
        System.out.println("nhap canh hinh vuong");
        Scanner scanner = new Scanner(System.in);
        this.dai = this.rong = scanner.nextFloat();
    }
    
}