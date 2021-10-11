package opp.books;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ListBookCatalogue {
    private final List<Book> books = new ArrayList();

    public void add(Book book) {
        books.add(book);
    }

    public Book finByISBN(String isbn){
        for (Book book : books){
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }

    public boolean removeBook(Book book){
        return  books.remove(book);
    }

    public void clear() {
        books.clear();
    }

    public int countBooks() {
        return books.size();
    }
}
