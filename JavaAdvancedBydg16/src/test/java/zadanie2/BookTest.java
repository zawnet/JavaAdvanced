package zadanie2;

import opp.zadanie2.Author;
import opp.zadanie2.Book;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    private Book book;

    @BeforeEach
    public void beforeEach() {
        book = new Book("Pan Tadeusz", new Author("Adam Mickiewicz", "romantyzm@polska.pl", 'm'), 50.00d);
    }

    @Test
    public void getNameTest(){

        assertEquals("Pan Tadeusz",book.getName());
    }

    @Test
    public void getAuthorTest(){
        assertEquals("Adam Mickiewicz", book.getAuthor());
    }

    @Test
    public void getPriceTest(){
        assertEquals(50.00, book.getPrice());
    }

    @Test
    public void setPriceTest(){
        double price = 70.00d;
        book.setPrice(price);
        assertNotEquals(50.00, book.getPrice());
        assertEquals(price,book.getPrice());

    }

}
