package Bai10.TruongDH;

import Bai10.ThiSinh.ThiSinh;
public class TruongDH {
    public String tenTruong;
    public String getTenTruong() {
        return tenTruong;
    }
    public TruongDH setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
        return this;
    }

    public double diemChuan;
    public double getDiemChuan() {
        return diemChuan;
    }
    public TruongDH setDiemChuan(double diemChuan) {
        this.diemChuan = diemChuan;
        return this;
    }

    public static TruongDH Builder(){
        return new TruongDH();
    }

    public TruongDH(){
        this.tenTruong = "";
        this.diemChuan = 0;
    }


    public String xetTuyen(ThiSinh thiSinh){
        return (((thiSinh.getDiemXetTuyen() >= this.getDiemChuan()) && thiSinh.kiemTraDiemLiet() == false)) ?
                "Chuc mung ban " + thiSinh.getHoTen() + " da trung tuyen vao truong " + this.getTenTruong() : 
                "Rat tiec, ban " + thiSinh.getHoTen() + " chua du dieu kien trung tuyen vao truong " + this.getTenTruong();
    }


}
