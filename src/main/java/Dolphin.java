public class Dolphin implements Domesticatable, Tradable {

    //make dolphin
    public Dolphin() {}

    //dolphin make sound
    @Override
    public String sound() {
        return "eeeeeeeee tehehehehe eep";
    }

    //dolphin make guap
    @Override
    public int getPrice() {
        return 420;
    }

    //dolphin make word
    @Override
    public String toString(){
        String id = super.toString();
        return id + " is a dolphin";
    }
}
