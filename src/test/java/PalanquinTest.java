import org.junit.*;
import static org.junit.Assert.*;

public class PalanquinTest {
    Palanquin p;
    @Before
    public void setUp() throws Exception {
        p = new Palanquin();
    }
    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(100, p.getPrice());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(5, p.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        p.upgradeSpeed();
        assertEquals(6, p.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        p.downgradeSpeed();
        assertEquals(4, p.getMaxSpeed());
    }
}
