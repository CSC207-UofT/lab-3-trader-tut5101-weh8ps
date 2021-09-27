import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChickenTest {
    Chicken ch;

    @Before
    public void setUp() throws Exception {
        ch = new Chicken(4);
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("bokbokbokbok", ch.sound());
    }

    @Test(timeout = 50)
    public void TestGetNumberOfBoks() {
        assertEquals(4, ch.getNumberOfBoks());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, ch.getPrice());
    }
}
