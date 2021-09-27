public class Car implements Tradable, Drivable {

    private String brand;
    private String color;
    private int price;
    private int maxSpeed;

    public Car(String brand, String color, int price, int maxSpeed){
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public Car(){
        this.maxSpeed = 100;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString(){
        return " (Brand: " + this.brand + " Color: " + this.color + "Price: " + this.price + ")";
    }

    /**
     * Increase the maximum speed of this Vehicle.
     **/
    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 10;
    };

    /**
     * Decrease the maximum speed of this Vehicle.
     **/
    @Override
    public void downgradeSpeed(){
        this.maxSpeed -= 10;
    };


    /**
     * Return the maximum speed of this Vehicle.
     *
     * @return    The current maximum speed of this Vehicle.
     **/
    @Override
    public int getMaxSpeed(){
        return this.maxSpeed;
    };

}
