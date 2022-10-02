package Bai8;

public class Person {
    public String ID;
    public void setID(String ID){
        this.ID = ID;
    }
    public String getID(){
        return ID;
    }
    
    public Name fullName;
    public Name getName() {
        return fullName;
    }
    public void setName(Name fullName) {
        this.fullName = fullName;
    }

    public String address;
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Person(){
        this.fullName = null;
        this.ID = "";
        this.address = "";
    }

    public Person (String ID, Name fullName, String address){
        this.ID = ID;
        this.fullName = fullName;
        this.address = address;
    }

    public void output(){
        System.out.println("ID: " + this.getID() 
                        + "         Fullname: " + this.fullName.toString() 
                        + "             Address: " + this.getAddress());
    }
}