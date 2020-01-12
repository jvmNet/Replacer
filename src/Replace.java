import printers.ConsolePrint;
import printers.IPrinter;
import readers.ConsoleReader;
import readers.IReader;

public class Replace {

    private IReader reader;
    private IPrinter printer;

    public Replace(final IReader reader, final IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    private void replace() {
        final String replace = reader.read().replace(":)", ")))");
        printer.print(replace);
    }

    public static void main(String[] args) {

        final IReader reader = new ConsoleReader("dhfjg:) _fjk:)fhj djfghj :)");
        final IPrinter printer = new ConsolePrint();
        final Replace replacer = new Replace(reader, printer);
        replacer.replace();

    }

}
