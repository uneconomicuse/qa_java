import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class LionTest {
    private final String sex;
    private final boolean expected;

    public LionTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void checkSexLion() throws Exception {
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Test
    public void checkInvalidSexLion() {
        Exception e = assertThrows(
                Exception.class, () -> {
                    Lion lion = new Lion("Некроморф");
                });
        String expected = "Используйте допустимые значения пола животного - самец или самка";
        String actual = e.getMessage();
        assertEquals(expected, actual);
    }

}



