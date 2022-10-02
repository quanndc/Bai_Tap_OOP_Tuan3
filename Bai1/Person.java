package Bai1;

import java.util.Scanner;

public class Person {
    public String ID;
    public void setID(String ID){
        this.ID = ID;
    }
    public String getID(){
        return ID;
    }
    
    public String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String address;
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Person(){
        this.name = "";
        this.ID = "";
        this.address = "";
    }

    public Person (String ID, String name, String address){
        this.ID = ID;
        this.name = name;
        this.address = address;
    }

    public void input(){
        Scanner input = new Scanner(System.in);
        this.ID = input.nextLine();
        this.name = input.nextLine();
        this.address = input.nextLine();

        input.close();
    }

    public void sayHello(){
        System.out.println("I am " + this.getName() + ". Hello everybody!!!");
    }

    
}
