package Bai7;

public class Font {
    public int fontSize;
    public int getFontSize() {
        return fontSize;
    }
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String fontName;
    public String getFontName() {
        return fontName;
    }
    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public Font(){
        this.fontSize = 0;
        this.fontName = "";
    }

    public Font(int fontSize, String fontName){
        this.fontSize = fontSize;
        this.fontName = fontName;
    }

    public void output(){
        System.out.println("Font size: " + this.getFontSize());
        System.out.println("Font name: " + this.getFontName());
    }
}

