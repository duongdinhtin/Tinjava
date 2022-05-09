package shapes;
import java.util.Scanner;
public class hinhChuNhat extends HinhHoc{
    public float dai;
    public float rong;

    public hinhChuNhat() {
        ten = "Hinh Chu Nhat";
    }

    public void nhapChieuDai() {
        System.out.println("nhap chieu dai: ");
        Scanner scanner = new Scanner(System.in);
        this.dai = scanner.nextFloat();
    }

    public void nhapChieuRong() {
        System.out.println("nhap chieu rong: ");
        Scanner scanner = new Scanner(System.in);
        this.rong = scanner.nextFloat();
    }
    
    public void tinhChuVi() {
        chuVi = 2 * (dai + rong);
    }

    public void tinhDienTich() {
        dienTich = dai*rong;
    }
}
