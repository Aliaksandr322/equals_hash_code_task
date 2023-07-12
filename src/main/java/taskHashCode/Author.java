package taskHashCode;

import java.util.Arrays;
import java.util.Objects;

public class Author {
    private Long id;
    private int version;
    private String firstName;
    private String lastName;
    private Publication publication[];

    public Author(Long id, int version, String firstName, String lastName) {
        this.id = id;
        this.version = version;
        this.firstName = firstName;
        this.lastName = lastName;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Publication[] getPublication() {
        return publication;
    }

    public void setPublication(Publication[] publication) {
        this.publication = publication;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", version=" + version +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", publication=" + Arrays.toString(publication) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return version == author.version && Objects.equals(id, author.id) && Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName) && Arrays.equals(publication, author.publication);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, version, firstName, lastName);
        result = 31 * result + Arrays.hashCode(publication);
        return result;
    }
}
