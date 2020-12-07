public class Mumrik extends Character{

    public Mumrik(String name) {
        super(name);
    }

    @Override
    public void seasonAction(Season season) {
        if (season == Season.WINTER) travel(Location.SOUTH);
        else if (season == Season.SPRING) travel(Location.MOMMIE_DOL);
        else impressEveryone();
    }

    public void travel(Location location) {
        if (location == Location.MOMMIE_DOL) System.out.printf("%s вернулся в %s. %n", getName(), location.getLocation());
        else System.out.printf("%s отправился странствовать на %s. %n", getName(), location.getLocation());
    }

    @Override
    public void randomAction() {
        System.out.println(getName() + " пропал!");
    }

    public void impressEveryone() {
        System.out.println(getName() + " был на редкость невозмутим и очень много знал, однако никогда не выставлял это напоказ.");
        tellAStory(getFriend(0));
    }

    public void tellAStory(Character character) {
        Animestory story = new Animestory();
        System.out.println(getName() + " решил рассказать " + character.getName() + " историю.");
        System.out.println("__________________________");
        story.run(3,2 );
        System.out.println("И вот конец истории.");
        System.out.println("___________________________");
        //character.modGordost'(10 %) with print "getName испытал гордость"
        // if Gordost' is 100 % destroy everything
    }
}
