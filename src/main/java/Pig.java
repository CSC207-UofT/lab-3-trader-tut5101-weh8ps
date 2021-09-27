public class Pig implements Drivable, Domesticatable, Tradable {
    private int fatness;
    private int maxSpeed;

    public Pig(int fatness) {
        this.fatness = fatness;
        this.maxSpeed = 100 / fatness;

    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    /**
     * Uh oh, this pig won't slow down. Better put a stop to this absolute menace
     */
    @Override
    public void downgradeSpeed() {
        this.maxSpeed += 10;
    }

    @Override
    public int getPrice() {
        return this.fatness * 10;
    }

    @Override
    public String sound() {
        return "Soulja boy I tell 'em\n" +
                "Ayy, I got a new dance for y'all called the Soulja Boy\n" +
                "You just gotta punch then crank back three times from left to right\n" +
                "Soulja Boy off in this hoe\n" +
                "Watch me crank it, watch me roll\n" +
                "Watch me crank that Soulja Boy\n" +
                "Then Superman that hoe\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch\n" +
                "Soulja Boy off in this hoe\n" +
                "Watch me crank it, watch me roll\n" +
                "Watch me crank that Soulja Boy\n" +
                "Then Superman that hoe\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch\n" +
                "Soulja boy up in this hoe\n" +
                "Watch me lean and watch me rock\n" +
                "Superman that hoe\n" +
                "Then watch me crank that Robocop\n" +
                "Super fresh, now watch me jock\n" +
                "Jocking on them haters man\n" +
                "When I do that Soulja Boy\n" +
                "I lean to the left and crank that thang, now\n" +
                "I'm jocking on your bitch ass\n" +
                "And if we get the fighting\n" +
                "Then I'm cocking on your bitch ass\n" +
                "You catch me at your local party\n" +
                "Yes I crank it everyday\n" +
                "Haters getting mad 'cause\n" +
                "I got me some bathing apes\n" +
                "Soulja Boy off in this hoe\n" +
                "Watch me crank it, watch me roll\n" +
                "Watch me crank that Soulja Boy\n" +
                "Then Superman that hoe\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch\n" +
                "Soulja Boy off in this hoe\n" +
                "Watch me crank it, watch me roll\n" +
                "Watch me crank that Soulja Boy\n" +
                "Then Superman that hoe\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch\n" +
                "I'm bouncin' on my toes\n" +
                "Watch me supersoak that hoe\n" +
                "I'm gonna pass it to Arab\n" +
                "Then he gon' crank it up fo' sho'\n" +
                "Haters wanna be me\n" +
                "Soulja boy, I'm the man\n" +
                "They be lookin' at my neck\n" +
                "Sayin' it's the rubber band man (Man)\n" +
                "Watch me do it (Watch me do it)\n" +
                "Dance (Dance)\n" +
                "Let get to it (Let get to it)\n" +
                "Nope, you can't do it like me\n" +
                "Hoe, so don't do it like me\n" +
                "Folk, I see you tryna do it like me\n" +
                "Man that shit was ugly\n" +
                "Soulja Boy off in this hoe\n" +
                "Watch me crank it, watch me roll\n" +
                "Watch me crank that Soulja Boy\n" +
                "Then Superman that hoe\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch\n" +
                "Soulja Boy off in this hoe\n" +
                "Watch me crank it, watch me roll\n" +
                "Watch me crank that Soulja Boy\n" +
                "Then Superman that hoe\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch\n" +
                "I'm too fresh, off in that hoe\n" +
                "Watch me crank it, watch me roll\n" +
                "Watch me crank that Roosevelt\n" +
                "And super soak that Hoe\n" +
                "Super soak that hoe\n" +
                "Super soak that hoe\n" +
                "Super soak that hoe\n" +
                "Super soak that hoe\n" +
                "I'm too fresh, now watch me do it\n" +
                "Watch me shuffle, watch me\n" +
                "Watch me crank that Soulja Boy\n" +
                "Now Superman\n" +
                "Superman, do it\n" +
                "Superman, do it\n" +
                "Soulja Boy off in this hoe\n" +
                "Watch me crank it, watch me roll\n" +
                "Watch me crank that Soulja Boy\n" +
                "Then Superman that hoe\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch\n" +
                "Soulja Boy off in this hoe\n" +
                "Watch me crank it, watch me roll\n" +
                "Watch me crank that Soulja Boy\n" +
                "Then Superman that hoe\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch me (Crank that Soulja Boy)\n" +
                "Now watch";
    }
}

