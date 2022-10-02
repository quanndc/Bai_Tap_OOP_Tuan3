package Bai4;

public class Main {
    public static void main(String[] args){
       Sach listBook[] = new Sach[5];
        
        listBook[0] = new Sach("Anh Van", "Quan", 2000, 100);
        listBook[1] = new Sach("Toan", "Quan", 2004, 234);
        listBook[2] = new Sach("Hoa", "Quan", 1999, 124);
        listBook[3] = new Sach("Vat ly", "Quan", 1826, 345);
        listBook[4] = new Sach("Ngu van", "Quan", 2020, 462);


        for(int i=0;i<listBook.length;i++){
            for(int j=i+1;j<listBook.length;j++){
                    if (listBook[i].getSoTrang() > listBook[j].getSoTrang()){
                        Sach temp = listBook[i];
                        listBook[i] = listBook[j];
                        listBook[j] = temp;
                    }
                }
            }
        for(int i=0;i<listBook.length;i++){
            listBook[i].output();
        }

        int newest = 0;
        for(int i=0;i<listBook.length;i++){
            if(listBook[i].getNamSx() > newest){
                newest = i;
            }
        }
        System.out.println("Sach co nam xuat ban moi nhat: " + listBook[newest].getTenSach());
    }
}

