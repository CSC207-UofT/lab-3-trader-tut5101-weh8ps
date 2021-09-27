import org.junit.*;

import static org.junit.Assert.*;

public class CarTest {

    Car car_01;
    Car car_02;

    @Before
    public void setUp_01() throws Exception {
        car_01 = new Car();
    }

    @Before
    public void setUp_02() throws Exception {
        car_02 = new Car("BMW", "white", 50000, 120);
    }

    @Test
    public void TestGetPrice_01() {
        assertEquals(0, car_01.getPrice());
    }

    @Test
    public void TestGetPrice_02() {
        assertEquals(50000, car_02.getPrice());
    }

    @Test
    public void TestUpgradeSpeed_01(){
        car_01.upgradeSpeed();;
        assertEquals(110, car_01.getMaxSpeed());
    }

    @Test
    public void TestUpgradeSpeed_02(){
        car_02.upgradeSpeed();;
        assertEquals(130, car_02.getMaxSpeed());
    }

    @Test
    public void TestDownGradeSpeed_01(){
        car_01.downgradeSpeed();
        assertEquals(90, car_01.getMaxSpeed());
    }

    @Test
    public void TestDownGradeSpeed_02(){
        car_02.downgradeSpeed();
        assertEquals(110, car_02.getMaxSpeed());
    }

    @Test
    public void TestToString(){
        assertEquals(" (Brand: BMW Color: whitePrice: 50000)", car_02.toString());
    }

}
