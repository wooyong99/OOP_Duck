import static org.example.strategy.DuckStrategy.DUCK_SIZE;
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

        verify(g).setColor(duck.getColor());
        verify(g).fillOval(duck.getX(), duck.getY(), DUCK_SIZE, DUCK_SIZE);
    }
}
