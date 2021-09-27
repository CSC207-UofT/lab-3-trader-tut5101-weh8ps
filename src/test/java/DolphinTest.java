import org.junit.*;

import static org.junit.Assert.*;

//test dolphin
public class DolphinTest {
    Dolphin d;

    @Before
    public void setUp() throws Exception {
        d = new Dolphin();
    }

    //test dolphin sound
    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("eeeeeeeee tehehehehe eep", d.sound());
    }

    //test dolphin word
    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(420, d.getPrice());
    }

}
