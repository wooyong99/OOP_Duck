import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.example.duck.Duck;
import org.junit.jupiter.api.Test;

public class DuckTest {
    @Test
    void createDuck() {
        Duck duck = Duck.create();
        assertNotNull(duck != null);
    }
}
