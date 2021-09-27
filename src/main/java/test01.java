public class test01 implements Drivable, Tradable {
    private int maxSpeed;

    public test01() {
        this.maxSpeed = 10;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed ++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed --;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 9;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
