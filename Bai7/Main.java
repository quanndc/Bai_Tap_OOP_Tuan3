package Bai7;

public class Main {
    public static void main(String[] args){
        Webpage webpage1 = new Webpage("Toi yeu lap trinh", 
                                    "Tieng Viet", 
                                    new Font(15, "Maven Pro"));

        webpage1.output();
        // Font font1 = new Font(15, "Maven Pro");

        // Webpage webpage2 = new Webpage();
        // webpage2.setTitle("Toi yeu lap trinh");
        // webpage2.setLanguage("Tieng Viet");
        // webpage2.setFontWebpage(font1);

        // webpage2.output();
    }
}
