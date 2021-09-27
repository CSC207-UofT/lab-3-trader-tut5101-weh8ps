public class Dolphin implements Domesticatable, Tradable {
    private int maxSpeed;

    public Dolphin() {
        this.maxSpeed = 1;
    }

    @Override
    public String sound() {
        return "eeeeeeeee tehehehehe eep";
    }

    @Override
    public int getPrice() {
        return 420;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " is a dolphin";
    }
}
