package collections.books;

import opp.books.Book;
import opp.books.ListBookCatalogue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookCatalogueTest {

    private ListBookCatalogue bookCatalogue = new ListBookCatalogue();

    Book czystyKod = new Book(
            "9788328302341",
            "Czysty kod. Podręcznik dobrego programisty",
            "Robert C. Martin ",
            "2015-03-25"
    );

    Book javaEffective = new Book(
            "978-83-283-4577-5",
            "CEffective Java (3rd Edition)",
            "Joshua Bloch",
            "2018-08-17"
    );

    Book tdd = new Book(
            "978-83-283-6572-8",
            "TDD. Sztuka tworzenia dobrego kodu",
            "Kent Beck",
            "2014-03-14"
    );

    Book designPatterns = new Book(
            "978-0201633610",
            "Design Patterns: Elements of Reusable Object-Oriented Software",
            "Erich Gamma",
            "1994-10-21"
    );

    @BeforeEach
    public void beforeEach(){

        bookCatalogue.add(czystyKod);
        bookCatalogue.add(javaEffective);
        bookCatalogue.add(tdd);
        bookCatalogue.add(designPatterns);
    }

    @AfterEach
    public void afterEach(){
        bookCatalogue.clear();
    }

    @Test
    public void shouldAddBookToCatalogue(){
        assertEquals(4, bookCatalogue.countBooks());
    }
}
