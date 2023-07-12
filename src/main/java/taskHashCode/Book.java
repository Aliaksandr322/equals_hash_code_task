package taskHashCode;

import java.time.LocalDate;
import java.util.Objects;

public class Book extends Publication {
    private int numPages;
    public Book(){}
    public Book(Long id, int version, String title, LocalDate publishingDate, Author[] authors, int numPages) {
        super(id, version, title, publishingDate, authors);
        this.numPages = numPages;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {

        this.numPages = numPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return numPages == book.numPages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numPages);
    }
}
