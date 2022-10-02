package Bai9;

import java.util.Scanner;

public class ThiSinh {
    private Scanner input = new Scanner(System.in);

    public String hoTen;

    public String getHoTen() {
        return hoTen;
    }

    public ThiSinh setHoTen(String hoTen) {
        this.hoTen = hoTen;
        return this;
    }

    public String soBaoDanh;

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public ThiSinh setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
        return this;
    }

    public double diemToan;

    public double getDiemToan() {
        return diemToan;
    }

    public ThiSinh setDiemToan(double diemToan) {
        this.diemToan = diemToan;
        return this;
    }

    public double diemVan;

    public double getDiemVan() {
        return diemVan;
    }

    public ThiSinh setDiemVan(double diemVan) {
        this.diemVan = diemVan;
        return this;
    }

    public double diemAV;

    public double getDiemAV() {
        return diemAV;
    }

    public ThiSinh setDiemAV(double diemAV) {
        this.diemAV = diemAV;
        return this;
    }

    public double diemXetTuyen;

    public double getDiemXetTuyen() {
        return diemXetTuyen;
    }

    public ThiSinh setDiemXetTuyen(double diemXetTuyen) {
        this.diemXetTuyen = diemXetTuyen;
        return this;
    }

    public ThiSinh() {
        this.soBaoDanh = "";
        this.hoTen = "";
        this.diemToan = 0;
        this.diemVan = 0;
        this.diemAV = 0;
    }

    public static ThiSinh builder() {
        return new ThiSinh();
    }

    public void input() {
        this.soBaoDanh = input.nextLine();
        this.hoTen = input.nextLine();
        this.diemToan = Double.parseDouble(input.nextLine());
        this.diemVan = Double.parseDouble(input.nextLine());
        this.diemAV = Double.parseDouble(input.nextLine());
    }

    public void tinhDiemXetTuyen() {
        this.diemXetTuyen = this.getDiemToan() * 2 + this.getDiemVan() * 2 + this.getDiemAV();
    }

    public boolean xetTuyen() {
        return (this.getDiemXetTuyen() >= 17 && this.getDiemToan() != 0 && this.getDiemAV() != 0
                && this.getDiemVan() != 0) ? true : false;
    }

    public void output() {
        String ketQua = xetTuyen() == true ? "Trung tuyen" : "Khong trung tuyen";
        System.out.println("Ho Ten: " + getHoTen()
                + "     So bao danh: " + this.getSoBaoDanh()
                + "     Diem xet tuyen: " + getDiemXetTuyen()
                + "     Ket qua: " + ketQua + "\n");
    }
}
