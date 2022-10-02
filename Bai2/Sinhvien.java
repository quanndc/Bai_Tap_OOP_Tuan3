package Bai2;

import java.util.Scanner;

public class Sinhvien{
    public String ID;
    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int dOb;
    public int getdOb() {
        return dOb;
    }

    public void setdOb(int dOb) {
        this.dOb = dOb;
    }

    public Sinhvien(){
        this.ID = "";
        this.name = "";
        this.dOb = 0;
    }

    public Sinhvien(String ID, String name, int dOb){
        this.ID = ID;
        this.name = name;
        this.dOb = dOb;
    }

    public void input(){
        Scanner input = new Scanner(System.in);
        this.ID = input.nextLine();
        this.name = input.nextLine();
        this.dOb = input.nextInt();

        input.close();
    }

    public int countAge(){
        return 2022 -  getdOb();
    }

    public void output(){
        System.out.println(this.getID() + "  " + this.getName() + "   " + this.getdOb());
    }
    

}