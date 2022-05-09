package main;
import slide72.sinhVien;
public class app72 {
    public static void main(String[] args) {
        sinhVien sv1 = new sinhVien();
        sinhVien sv2 = new sinhVien();

        sv1.setTen("");
        sv1.setTuoi(23);

        sv2.setTen("Peter");
        sv2.setTuoi(17);

        System.out.println("sinh vien 1 có ten: "+sv1.getTen()+" va co tuoi "+sv1.getTuoi());
        System.out.println("sinh vien 2 có ten: "+sv2.getTen()+" va co tuoi "+sv2.getTuoi());
    }
}
