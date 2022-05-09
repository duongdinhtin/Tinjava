package shapes;
import java.util.Scanner;
public class hinhTru extends hinhTron{
    public float chieuCao;

    public hinhTru() {
        this.ten ="Hinh trụ";
    }

    public void nhapChieuCao() {
        nhapBanKinh();

        System.out.println("Chieu cao = ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
    }

    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}
