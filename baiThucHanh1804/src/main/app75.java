package main;
import slide75.hinhHoc;
import slide75.hinhTron;
import slide75.hinhChuNhat;
public class app75 {
    public static void main(String[] args) {
        hinhHoc hinhhoc = new hinhHoc();
        hinhTron hinhtron1 = new hinhTron();
        hinhTron hinhtron2 = new hinhTron();
        hinhChuNhat hinhChuNhat = new hinhChuNhat();

        System.out.println("có tất cả "+ hinhhoc.dem + " hinh trong app");
    }
}
