public class Chicken implements Tradable, Domesticatable {

    private int numberOfBoks = 0;
    /**
     * Initializes a new Chicken class.
     */
    public Chicken(int numberOfBoks) {
        this.numberOfBoks = numberOfBoks;
    }

    @Override
    public int getPrice() { return 100; }

    @Override
    public String sound() {
        StringBuilder bokBokBok = new StringBuilder("");
        for (int i = 0; i <= numberOfBoks - 1; i++) {
            bokBokBok.append("bok");
        }
        String bok = bokBokBok.toString();
        return bok;
    }
}
