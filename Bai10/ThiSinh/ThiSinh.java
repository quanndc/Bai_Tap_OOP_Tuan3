package Bai10.ThiSinh;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.*;
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

    public double diem1;
    public double getDiem1() {
        return diem1;
    }
    public ThiSinh setDiem1(double diem1) {
        this.diem1 = diem1;
        return this;
    }

    public double diem2;
    public double getDiem2() {
        return diem2;
    }
    public ThiSinh setDiem2(double diem2) {
        this.diem2 = diem2;
        return this;
    }

    public double diem3;
    public double getDiem3() {
        return diem3;
    }
    public ThiSinh setDiem3(double diem3) {
        this.diem3 = diem3;
        return this;
    }

    public double diemXetTuyen;
    public double getDiemXetTuyen() {
        return diemXetTuyen;
    }
    public ThiSinh setDiemXetTuyen(double diemXetTuyen){
        this.diemXetTuyen = diemXetTuyen;
        return this;
    }

    public boolean HSG;
    public boolean isHSG() {
        return HSG;
    }
    public ThiSinh setHSG(boolean hSG) {
        this.HSG = hSG;
        return this;
    }

    public boolean uuTien;
    public boolean isUuTien() {
        return uuTien;
    }
    public ThiSinh setUuTien(boolean uuTien) {
        this.uuTien = uuTien;
        return this;
    }

    public boolean kiemTraDiemLiet(){
        return (this.getDiem1() == 0 || this.getDiem2() == 0 || this.getDiem3() == 0) ? true : false;
    }

    public static ThiSinh Builder(){
        return new ThiSinh();
    }

    public ThiSinh(){
        this.soBaoDanh = "";
        this.hoTen = "";
        this.diem1 = 0;
        this.diem2 = 0;
        this.diem3 = 0;
        this.HSG = true;
        this.uuTien = true;
    }

    public void input(){
        this.soBaoDanh = input.nextLine();
        this.hoTen = input.nextLine();
        this.diem1 = Double.parseDouble(input.nextLine());
        this.diem2 = Double.parseDouble(input.nextLine());
        this.diem3 = Double.parseDouble(input.nextLine());
        this.HSG = input.nextBoolean();
        this.uuTien = input.nextBoolean();
    }

    public void tinhDiemXetTuyen(){
        this.diemXetTuyen = this.getDiem1() + this.getDiem2() + this.getDiem3()
                            + ((isHSG() == true ? 1 : 0) + (isUuTien() == true ? 0.5 : 0)); 
    }

}
