import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test01Test {
    test01 unit01;
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10, unit01.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        unit01.upgradeSpeed();
        assertEquals(11, unit01.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        unit01.downgradeSpeed();
        assertEquals(9, unit01.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(9, unit01.getPrice());
    }
}