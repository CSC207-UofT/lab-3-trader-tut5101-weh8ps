public class Palanquin implements Tradable, Drivable{
    private int price;
    private int maxspeed;
    public Palanquin() {
        this.price = 100;
        this.maxspeed = 5;
    }

    @Override
    public void upgradeSpeed() {
        this.maxspeed ++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxspeed --;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxspeed;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
