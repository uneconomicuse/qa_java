import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionExceptionTest {

    @Test
    public void checkInvalidSexLion() {
        Exception e = assertThrows(
                Exception.class, () -> {
                    Lion lion = new Lion("Некроморф", new Feline());
                });
        String expected = "Используйте допустимые значения пола животного - самец или самка";
        String actual = e.getMessage();
        assertEquals(expected, actual);
    }

}
