package printers;

public class ConsolePrint implements IPrinter {

    @Override
    public void print(String text) {
        System.out.println(text);
    }

}
