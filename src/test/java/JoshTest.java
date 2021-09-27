/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class JoshTest {
    Josh j;

    @Before
    public void setUp() throws Exception {
        j = new Josh();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("CAWWWWW", j.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10, j.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        j.upgradeSpeed();
        assertEquals(11, j.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        j.downgradeSpeed();
        assertEquals(9, j.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1000000, j.getPrice());
    }

}