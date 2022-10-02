package Bai10;

import Bai10.ThiSinh.ThiSinh;
import Bai10.TruongDH.TruongDH;

public class Main {
    public static void main(String[] args){
        ThiSinh thiSinh1 = ThiSinh.Builder().setSoBaoDanh("1")
        .setHoTen("Tran Minh Quan")
        .setHSG(true)
        .setDiem1(10)
        .setDiem2(9)
        .setDiem3(9)
        .setUuTien(false);

        ThiSinh thiSinh2 = new ThiSinh();
        thiSinh2.input();
        ThiSinh thiSinh3 = new ThiSinh();
        thiSinh3.input();

        TruongDH truong1 = new TruongDH()
        .setTenTruong("HSU")
        .setDiemChuan(15);

        TruongDH truong2 = new TruongDH()
        .setTenTruong("HUTECH")
        .setDiemChuan(16);

        TruongDH truong3 = new TruongDH()
        .setTenTruong("SGU")
        .setDiemChuan(15.5);


        thiSinh1.tinhDiemXetTuyen();
        thiSinh2.tinhDiemXetTuyen();
        thiSinh3.tinhDiemXetTuyen();
        System.out.println(truong1.xetTuyen(thiSinh1));
        System.out.println(truong2.xetTuyen(thiSinh2));
        System.out.println(truong3.xetTuyen(thiSinh3));

        //System.out.println(thiSinh1.getDiemXetTuyen());



    }
}
