package main;
import slide71.toaDo;
import slide71.hinhTron;
public class app71 {
    public static void main(String[] args){
        hinhTron hinhtron = new hinhTron();

        hinhtron.setBanKinh(10);

        float chuVi = hinhtron.tinhChuVi();
        float dienTich = hinhtron.tinhDienTich();

        System.out.println("chu vi: "+chuVi+"dien tich: "+dienTich);
    }
}
