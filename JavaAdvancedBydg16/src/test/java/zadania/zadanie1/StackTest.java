package zadania.zadanie1;

import org.junit.jupiter.api.*;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("A stack")
public class StackTest {

    private Stack<Object> stack;
    //add
    //pop
    //peek
    @DisplayName("when new")
    @Nested
    public class WhenNew {

        @BeforeEach
        public void createNewStack(){
            stack = new Stack<>();
        }
        @Test
        @DisplayName("throws ThrowEmptyStackException")
        public void shouldThrowEmptyStackException(){
            assertThrows(UnsupportedOperationException.class, stack::pop);
        }

    }
}
