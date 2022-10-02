package Bai8;

public class Main {
    public static void main(String[] args){
        //Name name = new Name("Tran", "Minh", "Quan");

        Person Array[] = new Person[5];
        Array[0] = new Person("1", new Name("Tran", "Minh", "Quan"), "Sa Dec");
        Array[1] = new Person("2", new Name("Le", "Huy", "Hoang"), "Go Vap");
        Array[2] = new Person("3", new Name("Le", "Hoang", "Duy"), "Tan Binh");
        Array[3] = new Person("4", new Name("Bui", "Duc Dang", "Khoa"), "Quan 1");
        Array[4] = new Person("5", new Name("Nguyen", "Phu", "Quy"), "Binh Thanh");
        
        for(int i=0;i<Array.length;i++){
            for(int j=i+1;j<Array.length;j++){
                if (Array[i].fullName.getFirstName().compareTo(Array[j].fullName.getFirstName()) > 0){
                    Person temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
            }
        }
        for(int i=0;i<Array.length;i++){
            Array[i].output();
        }
    }
}
