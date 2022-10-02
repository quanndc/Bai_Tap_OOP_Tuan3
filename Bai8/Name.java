package Bai8;

public class Name {
    
    public String firstName;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String middleName;
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String lastName;
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Name(){
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
    }

    public Name(String firstName, String middleName, String latsName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = latsName;
    }

    public String toString(){
        return String.format("%s %s %s", this.getFirstName(), this.getMiddleName(), this.getLastName());
    }



}
