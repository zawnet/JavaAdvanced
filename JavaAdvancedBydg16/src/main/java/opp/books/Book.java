package opp.books;

import java.util.Date;

public class Book {

    private String isbn;
    private String title;
    private String author;
    private String publicationDate;

    public Book(String isbn, String title, String author, String publicationDate) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }
}
