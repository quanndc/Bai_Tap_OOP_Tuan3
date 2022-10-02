package Bai3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Sanpham> listSp = new ArrayList<>();
        listSp.add(new Sanpham("1","Chen","cai",10000,2020));
        listSp.add(new Sanpham("2","Dia","cai",20000,2020));
        listSp.add(new Sanpham("3","To","cai",30000,2020));

        listSp.get(0).setSoLuong(3);
        listSp.get(1).setSoLuong(7);
        listSp.get(2).setSoLuong(10);

        float tongTien = 0;
        for(int i=0;i<listSp.size();i++){
            tongTien += (float) (listSp.get(i).getSoLuong() * listSp.get(i).getGia());
        }
        System.out.println(tongTien);

        float giaCaoNhat = 0;
        for(int i=0;i<listSp.size();i++){
            if(listSp.get(i).getGia() > giaCaoNhat){
                giaCaoNhat = listSp.get(i).getGia();
            }
        }
        System.out.println("Sp gia cao nhat la: " + giaCaoNhat);


    }
}
