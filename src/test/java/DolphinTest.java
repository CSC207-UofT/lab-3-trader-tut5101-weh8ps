import org.junit.*;

import static org.junit.Assert.*;


public class DolphinTest {
    Dolphin d;

    @Before
    public void setUp() throws Exception {
        d = new Dolphin();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("eeeeeeeee tehehehehe eep", h.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(420, h.getPrice());
    }

}
