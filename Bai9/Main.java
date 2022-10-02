package Bai9;

public class Main {
    public static void main(String[] args) throws Exception{
        ThiSinh thiSinh1 = ThiSinh.builder().setSoBaoDanh("1")
        .setHoTen("Tran Minh Quan")
        .setDiemToan(10)
        .setDiemAV(10)
        .setDiemVan(10);
        thiSinh1.tinhDiemXetTuyen();
        
        ThiSinh thiSinh2 = new ThiSinh();
        ThiSinh thiSinh3 = new ThiSinh();
        
        thiSinh2.input();
        thiSinh3.input();

        thiSinh2.tinhDiemXetTuyen();
        thiSinh3.tinhDiemXetTuyen();
    
        thiSinh1.output();
        thiSinh2.output();
        thiSinh3.output();
    }
}
