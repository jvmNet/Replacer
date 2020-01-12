package printers;

public class ScreenPrint implements IPrinter {

    @Override
    public void print(String text) {
        System.out.println(text + " length string: " + text.length());
    }

}
