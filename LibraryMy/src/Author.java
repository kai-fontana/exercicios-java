
import java.awt.print.Book;
import java.util.List;

public class Author extends Person{
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    
}
