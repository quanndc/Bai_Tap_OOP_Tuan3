package Bai6;

public class PhuongTrinhB2 {
    public double a;
    public double getA() {
        return a;
    }
    public void setA(float a) {
        this.a = a;
    }

    public double b;
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    public double c;
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public PhuongTrinhB2(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public PhuongTrinhB2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void giaiPT(){
        if (this.getA() == 0) {
            if (this.getB() == 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else {
                System.out.println("Phuong trinh co 1 nghiem: " + "x = " + (-this.getC() / this.getB()));
            }
            return;
        }
        double delta = (double) this.getB()*this.getB() - 4*this.getA()*this.getC();
        double x1 = 0, x2 = 0;
        if (delta > 0) {
            x1 = (double) ((-this.getB() + Math.sqrt(delta)) / (2*this.getA()));
            x2 = (double) ((-this.getB() - Math.sqrt(delta)) / (2*this.getA()));
            System.out.println("Phuong trinh co 2 nghiem: " + "x1 = " + x1 + " và x2 = " + x2);
            return;
        } 
        else if (delta == 0) {
            x1 = (-this.getB() / (2 * this.getA()));
            System.out.println("Phuong trinh co nghiem kep: " + "x1 = x2 = " + x1);
            return;
        }
        else {
            System.out.println("Phuong trinh vo nghiem!");
            return;
        }
    }
}
