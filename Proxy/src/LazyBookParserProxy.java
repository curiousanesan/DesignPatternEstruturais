import java.awt.print.Book;

public class LazyBookParserProxy implements IBookParser {
    private BookParser parser = null;

    public LazyBookParserProxy (String book) {
        this.book = book;
    }
    private String book = null;

    public int getNumPages () {
        if (this.parser == null) this.parser = new BookParser(this.book);
        return this.parser.getNumPages();
    }
}
