package main;
import shapes.hinhTron;
import shapes.hinhChuNhat;
import shapes.hinhTru;
import shapes.hinhVuong;
public class app54 {
    public static void main(String[] args) throws Exception {
        hinhTron ht = new hinhTron();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();
        
        //kiem tra hình trụ
        hinhTru hTru = new hinhTru();
        hTru.xuatTen();
        hTru.nhapChieuCao();
        hTru.tinhTheTich();
        hTru.inTheTich();

        //kiem tra hinh chữ nhật
        hinhChuNhat hCN = new hinhChuNhat();
        hCN.xuatTen();
        hCN.nhapChieuDai();
        hCN.nhapChieuRong();
        hCN.tinhChuVi();
        hCN.tinhDienTich();
        hCN.inChuVi();
        hCN.inDienTich();

        //kiem tra hình vuông
        hinhVuong hV = new hinhVuong();
        hV.xuatTen();
        hV.nhapChieuDai();
        hV.tinhChuVi();
        hV.tinhDienTich();
        hV.inChuVi();
        hV.inDienTich();
}
}