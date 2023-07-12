package taskHashCode;

import java.time.LocalDate;
import java.util.Objects;

public class BlogPost extends Publication{
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BlogPost(Long id, int version, String title, LocalDate publishingDate, Author[] authors, String url) {
        super(id, version, title, publishingDate, authors);
        this.url = url;
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "url='" + url + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BlogPost blogPost = (BlogPost) o;
        return Objects.equals(url, blogPost.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), url);
    }
}
