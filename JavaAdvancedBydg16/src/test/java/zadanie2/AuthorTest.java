package zadanie2;

import opp.zadanie2.Author;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthorTest {

    private Author author;

    @BeforeEach
    public void beforeEach(){
        author = new Author("Jan Kowalski", "kowalski@pwn.pl",'m');
    }

    @Test
    public void getNameTest(){
        assertEquals("Jan Kowalski", author.getName());
    }

    @Test
    public void getEmailTest(){
        String emai = "kowalski@pwn.pl";
        assertEquals(emai,author.getEmail());
    }

    @Test
    public void setEmailTest(){
        String emai = "kowalski@wp.pl";
        author.setEmail(emai);
        assertNotEquals("kowalski@pwn.pl",author.getEmail());
        assertEquals(emai,author.getEmail());
    }

    @Test
    public void getGenderTest(){
        char gender = 'm';
        assertEquals(gender,author.getGender());
    }



}
