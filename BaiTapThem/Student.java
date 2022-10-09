package BaiTapThem;
import java.util.Comparator;
import java.util.Scanner;

public class Student implements Comparator<Student>{
    private Scanner input = new Scanner(System.in);
    public String iD;

    public String getiD() {
        return iD;
    }
    public void setiD(String iD) throws Exception{
        if(iD.matches("[a-zA-Z]{2}[0-9]{7}")){
            this.iD = iD;
        }
        else{
            throw new Exception("Invalid ID");
        }
    }

    public String name;
    public String getName() {
        return name;
    }
    public void setName(String name) throws Exception{
        if(name.split("\\s+").length < 2){
            throw new Exception("Invalid name");
        }
        else{
            this.name = name;
        }
    }


    public String getFirstName(){
        String[] fname  = new String[this.getName().split("\\s+").length]; 
        fname = this.getName().split("\\s+");
        return fname[this.getName().split("\\s+").length-1];

    }

    public String getLastName(){
        return this.getName().substring(0,this.getName().length() - this.getFirstName().length());
    }

    public String getEmail(){
        String subArr = "";
        for (int i=0;i<getLastName().length();i++){
            char ch;
            if(Character.isUpperCase(ch = getLastName().charAt(i))){
                subArr += ch;if(Character.isUpperCase(ch));
            }
        }
        return getFirstName() + "." + subArr + getiD().substring(5) + "@sinhvien.hoasen.edu.vn"; 
    }


    public Student(){
        this.iD = "";
        this.name = "";
    }

    public Student(String iD, String name) throws Exception{
        if(iD.matches("[a-zA-Z]{2}[0-9]{7}")){
            this.iD = iD;
        }
        else{
            throw new Exception("Invalid ID");
        }

        if(name.split("\\s+").length < 2){
            throw new Exception("Invalid name");
        }
        else{
            this.name = name;
        }
    }

    public void inputID(){
        do{
            System.out.print("Nhap ID: ");
            this.iD = input.nextLine();
            if(!(this.getiD().matches("[a-zA-Z]{2}[0-9]{7}"))){
                System.out.println("ID khong hop le!");
            }
        }while(!(this.getiD().matches("[a-zA-Z]{2}[0-9]{7}")));
    }

    public void inputName(){
        do{
            System.out.print("Nhap ten: ");
            this.name = input.nextLine();
            if(this.getName().split("\\s+").length < 2){
                System.out.println("Ten khong hop le!");
            }
        }while(this.getName().split("\\s+").length < 2);
    }

    public void input(){
        do{
            System.out.print("Nhap ID: ");
            this.iD = input.nextLine();
            if(!(this.getiD().matches("[a-zA-Z]{2}[0-9]{7}"))){
                System.out.println("ID khong hop le!");
            }
        }while(!(this.getiD().matches("[a-zA-Z]{2}[0-9]{7}")));

        do{
            System.out.print("Nhap ten: ");
            this.name = input.nextLine();
            if(this.getName().split("\\s+").length < 2){
                System.out.println("Ten khong hop le!");
            }
        }while(this.getName().split("\\s+").length < 2);
        
    }

    public String output(){
        return String.format("%-10s%-10s%15s%37s\n", this.getiD(), this.getLastName(), this.getFirstName(), this.getEmail());
    }
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getiD().compareTo(o2.getiD()); 
    }
}
