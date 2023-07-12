package taskHashCode;

import java.time.LocalDate;

public class EqualsTester {
    public static void main(String[] args) {

        Author author1 = new Author(001L,01,"George", "Orwell");
        Author author2 = new Author(002L,02, "Jules","Verne");
        Author author3 = new Author(003L,03,"Agatha","Christie");
        Author author4 = new Author(004L,04,"Leo ","Tolstoy");
        Author author5 = new Author(005L,05,"Charles","Dickens");



        Publication publication1 = new Publication(001L,01,"Animal Farm", LocalDate.of(1914,12,31),new Author[]{author1});
        Publication publication2 = new Publication(002L,02,"Animal Farm", LocalDate.of(1956,1,31),new Author[]{author2});
        Publication publication3 = new Publication(003L,03,"Animal Farm", LocalDate.of(1984,2,5),new Author[]{author3});
        Publication publication4 = new Publication(004L,04,"Animal Farm", LocalDate.of(1974,3,31),new Author[]{author4});
        Publication publication5 = new Publication(005L,05,"Animal Farm", LocalDate.of(1932,4,5),new Author[]{author5});


        Publication publication6 = new Book(1L,1,"Animal Farm",LocalDate.of(1914,12,28),new Author[]{author5},235);
        Book book100 = new Book(1L,1,"Animal Farm",LocalDate.of(1914,12,28),new Author[]{author5},235);
        System.out.println(book100.equals(publication6));
        System.out.println(book100.hashCode());
        System.out.println(publication6.hashCode());
        System.out.println(book100.hashCode() == publication6.hashCode());

        Book book1 = new Book(001L,01,"Animal Farm", LocalDate.of(1914,12,31),new Author[]{author1},498);
        Book book2 = new Book(002L,02,"Animal Farm", LocalDate.of(1956,1,31),new Author[]{author2},651);
        Book book3 = new Book(003L,03,"Animal Farm", LocalDate.of(1984,2,5),new Author[]{author3},895);
        Book book4 = new Book(004L,04,"Animal Farm", LocalDate.of(1974,3,31),new Author[]{author4},496);
        Book book5 = new Book(005L,05,"Animal Farm", LocalDate.of(1932,4,5),new Author[]{author5},165);

        BlogPost blogPost1 = new BlogPost(001L,01,"Animal Farm", LocalDate.of(1914,12,31),new Author[]{author1},"498");
        BlogPost blogPost2 = new BlogPost(002L,02,"Animal Farm", LocalDate.of(1956,1,31),new Author[]{author2},"651");
        BlogPost blogPost3 = new BlogPost(003L,03,"Animal Farm", LocalDate.of(1984,2,5),new Author[]{author3},"895");
        BlogPost blogPost4 = new BlogPost(004L,04,"Animal Farm", LocalDate.of(1974,3,31),new Author[]{author4},"496");
        BlogPost blogPost5 = new BlogPost(005L,05,"Animal Farm", LocalDate.of(1932,4,5),new Author[]{author5},"165");

        Publication publication7 = new Publication(001L,01,"Animal Farm", LocalDate.of(1914,12,31),new Author[]{author1});
        Publication publication8 = new BlogPost(001L,01,"Animal Farm", LocalDate.of(1914,12,31),new Author[]{author1},"498");

        System.out.println(publication7.equals(publication8));
        System.out.println(publication7.hashCode());
        System.out.println(publication8.hashCode());
        System.out.println(publication7.hashCode() == publication8.hashCode());

        System.out.println(publication7.getClass());
        System.out.println(publication8.getClass());

    }
}
