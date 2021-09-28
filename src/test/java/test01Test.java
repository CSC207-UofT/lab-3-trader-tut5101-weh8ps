import org.junit.*;

import static org.junit.Assert.*;


public class test01Test {
    test01 a;

    @Before
    public void setUp() throws Exception {
        a = new test01();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10, a.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        a.upgradeSpeed();
        assertEquals(11, a.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        a.downgradeSpeed();
        assertEquals(9, a.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(9, a.getPrice());
    }

}