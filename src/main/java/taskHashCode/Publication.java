package taskHashCode;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Publication {
    private Long id;
    private int version;
    private String title;
    private LocalDate publishingDate;
    private Author authors[];

    public Publication(){}
    public Publication(Long id, int version, String title, LocalDate publishingDate, Author[] authors) {
        this.id = id;
        this.version = version;
        this.title = title;
        this.publishingDate = publishingDate;
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(LocalDate publishingDate) {
        this.publishingDate = publishingDate;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "id=" + id +
                ", version=" + version +
                ", title='" + title + '\'' +
                ", publishingDate=" + publishingDate +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publication that = (Publication) o;
        return version == that.version && Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(publishingDate, that.publishingDate) && Arrays.equals(authors, that.authors);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, version, title, publishingDate);
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }
}
