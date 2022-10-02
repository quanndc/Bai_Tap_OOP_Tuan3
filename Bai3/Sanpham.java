package Bai3;

public class Sanpham {
    public String maSp;
    public String getMaSp() {
        return maSp;
    }
    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String tenSp;
    public String getTenSp() {
        return tenSp;
    }
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String donVi;
    public String getDonVi() {
        return donVi;
    }
    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public float gia;
    public float getGia() {
        return gia;
    }
    public void setGia(float gia) {
        this.gia = gia;
    }

    public int namSx;
    public int getNamSx() {
        return namSx;
    }
    public void setNamSx(int namSx) {
        this.namSx = namSx;
    }

    public int soLuong;
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Sanpham(){
        this.maSp = "";
        this.tenSp = "";
        this.donVi = "";
        this.gia = 0;
        this.namSx = 0;
    }

    public Sanpham(String maSp, String tenSp, String donVi, float gia, int namSx){
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.donVi = donVi;
        this.gia = gia;
        this.namSx = namSx;
    }

    public void output(){
        System.out.println(this.getMaSp() + ";" 
                        + this.getTenSp() + ";" 
                        + this.getGia() + ";" 
                        + this.getDonVi() + ";" 
                        + this.getNamSx());
    }



}
