package Bai5;

public class Main {
    public static void main(String[] args){
        // HinhChuNhat hinh1 = new HinhChuNhat(5, 10);
        // hinh1.veHinh();

        // System.out.println("Chu vi HCN: " + hinh1.tinhChuVi());
        // System.out.println("Dien tich HCN: " + hinh1.tinhDienTich());

        // HinhChuNhat hinh2 = new HinhChuNhat();
        // hinh2.setChieuDai(7);
        // hinh2.setChieuRong(14);
        // System.out.println("Chu vi HCN: " + hinh2.tinhChuVi());
        // System.out.println("Dien tich HCN: " + hinh2.tinhDienTich());

        HinhChuNhat hinh3 = new HinhChuNhat(2,3);
        HinhChuNhat hinh4 = new HinhChuNhat(4,5);
        HinhChuNhat hinh5 = new HinhChuNhat(6,7);

        System.out.println("Tong chu vi 3 tam giac: "   +(hinh3.tinhChuVi()
                                                        +hinh4.tinhChuVi()
                                                        +hinh5.tinhChuVi()));

        System.out.println("Binh quan dien tich 3 tam giac: "   +(hinh3.tinhDienTich()
                                                                +hinh4.tinhDienTich()
                                                                +hinh5.tinhDienTich()));
    }
}
