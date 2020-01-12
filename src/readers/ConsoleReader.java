package readers;

public class ConsoleReader implements IReader {

    private String textRead;

    public ConsoleReader(final String textRead) {
        this.textRead = textRead;
    }

    @Override
    public String read() {
        return textRead;
    }
}
