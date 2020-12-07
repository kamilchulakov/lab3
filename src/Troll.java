public class Troll extends Character{

    public Troll(String name) {
        super(name);
    }

    @Override
    public void seasonAction(Season season) {
        if (season == Season.WINTER) {
            if (getSex().equals("male")) System.out.println(getName() + " погрузился в сон.");
            else System.out.println(getName() + " погрузилась в сон.");
        }
        else if (season == Season.SPRING) System.out.print("");
    }

    @Override
    public void randomAction() {
        seasonAction(Season.WINTER);
    }
}
