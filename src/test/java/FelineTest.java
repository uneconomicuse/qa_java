import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Animal animal;

    @Test
    public void checkEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expected, actual);
    }

    @Test
    public void checkGetFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";

        assertEquals(expected, actual);
    }

    @Test
    public void checkGetKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void checkGetKittensWithValue() {
        Feline feline = new Feline();
        int actual = feline.getKittens(10);
        int expected = 10;

        assertEquals(expected, actual);
    }
}
