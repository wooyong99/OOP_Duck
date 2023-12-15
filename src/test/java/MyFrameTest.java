import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.duck.Duck;
import org.junit.jupiter.api.Test;

public class MyFrameTest {
    @Test
    void addDuckList() {
        Duck[] duckList = {Duck.create(0), Duck.create(1), Duck.create(2), null, null, null};
        int inCount = 0;
        for (int i = 0; i < duckList.length; i++) {
            if (duckList[i] != null) {
                inCount++;
            }
        }
        assertEquals(inCount, 3);
    }
}
