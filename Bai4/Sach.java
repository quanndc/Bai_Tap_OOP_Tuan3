package Bai4;

public class Sach {
    public String tenSach;

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String tacGia;

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int namSx;

    public int getNamSx() {
        return namSx;
    }

    public void setNamSx(int namSx) {
        this.namSx = namSx;
    }

    public int soTrang;

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public Sach() {
        this.tenSach = "";
        this.tacGia = "";
        this.namSx = 0;
        this.soTrang = 0;
    }

    public Sach(String tenSach, String tacGia, int namSx, int soTrang) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namSx = namSx;
        this.soTrang = soTrang;
    }


    public void output() {
        System.out.println(this.getTenSach() + "     "
                + this.getTacGia() + "     "
                + this.getNamSx() + "      "
                + this.getSoTrang());
    }
}
