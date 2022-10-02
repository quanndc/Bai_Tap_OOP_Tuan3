package Bai7;

public class Webpage {
    public String title;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String language;
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    
    public Font fontWebpage;
    public Font getFontWebpage() {
        return fontWebpage;
    }
    public void setFontWebpage(Font fontWebpage) {
        this.fontWebpage = fontWebpage;
    }

    public Webpage(){
        this.title = "";
        this.language = "";
        this.fontWebpage = null;
    }

    public Webpage(String title, String language, Font fontWebpage){
        this.title = title;
        this.language = language;
        this.fontWebpage = fontWebpage; 
    }

    public void output(){
        System.out.println("Title: " + this.getTitle());
        System.out.println("Language: " + this.getLanguage());
        this.fontWebpage.output();
    }

}
