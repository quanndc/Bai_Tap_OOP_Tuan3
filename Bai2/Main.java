package Bai2;

public class Main {
    public static void main(String[] args){
        Sinhvien sv1 = new Sinhvien("123", "Quan", 2003);
        Sinhvien sv2 = new Sinhvien();

        sv2.input();


        sv1.output();
        sv2.output();
    }
}
