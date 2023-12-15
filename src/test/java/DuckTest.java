import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.awt.Graphics;
import org.example.duck.Duck;
import org.junit.jupiter.api.Test;

public class DuckTest {
    @Test
    void createDuck() {
        Duck duck = Duck.create(0);
        assertNotNull(duck != null);
    }

    @Test
    void displayDuck() {
        Duck duck = Duck.create(0);
        Graphics g = mock(Graphics.class);
        duck.display(g);

        verify(g).setColor(duck.getColor());
        verify(g).fillOval(duck.getX(), duck.getY(), Duck.DUCK_SIZE, Duck.DUCK_SIZE);
    }
}
