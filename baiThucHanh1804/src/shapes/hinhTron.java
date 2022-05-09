package shapes;
import java.util.Scanner;
public class hinhTron extends HinhHoc{
    public float banKinh;

    public hinhTron() {
        this.ten = "Hinh tron";
    }
    public void nhapBanKinh() {
        System.out.println("Ban kinh = ");
        Scanner scanner = new Scanner(System.in);
        banKinh = scanner.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = 2 * Pi * banKinh;
    }

    public void tinhDienTich() {
        dienTich = Pi * banKinh * banKinh;
    }
}
