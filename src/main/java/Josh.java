public class Josh implements Drivable, Domesticatable, Tradable{
    private int maxSpeed;
    private boolean lanky;
    private boolean isBeingIgnored;

    public Josh() {
        this.maxSpeed = 10;
        this.lanky = true;
        this.isBeingIgnored = true;
    }

    @Override
    public String sound() {
        return "CAWWWWW";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 1000000;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")" + "lanky: " + this.lanky + "is being ignored:" + this.isBeingIgnored;
    }
}
