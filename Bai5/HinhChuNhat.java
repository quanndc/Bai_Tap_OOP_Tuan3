package Bai5;

import java.util.Scanner;

public class HinhChuNhat {
    public double chieuDai;
    public double getChieuDai() {
        return chieuDai;
    }
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double chieuRong;
    public double getChieuRong() {
        return chieuRong;
    }
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public HinhChuNhat(){
        this.chieuDai = 0;
        this.chieuRong = 0;
    }

    public HinhChuNhat(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void veHinh(){
        for(int i=1;i<=this.chieuDai;i++){
            for(int j=1;j<this.chieuRong;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public double tinhChuVi(){
        return (this.getChieuDai() + this.getChieuRong())*2;
    }

    public double tinhDienTich(){
        return this.getChieuDai()*this.getChieuRong();
    }

    public void input(){
        Scanner input = new Scanner(System.in);
        this.chieuDai = input.nextDouble();
        this.chieuRong = input.nextDouble();

        input.close();
    }

    



}
