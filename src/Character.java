import java.util.ArrayList;
import java.util.Objects;

public abstract class Character {
    private String name;
    private ArrayList<Character> friends = new ArrayList<Character>();
    private int kappaPride;
    private String sex = "male";

    protected Character(String name) {
        setName(name);
    }
    protected Character() {
        this("Character");
    }


    public void addFriend(Character character) {
        this.friends.add(character);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addKappaPride(int i) {
        kappaPride += i;
    }

    public Character getFriend(int i) {
        return friends.get(i);
    }

    public String getInfo() {
        String info = "";
        if (sex.equals("male")) info = getName() + " был его лучшим другом.";
        else info = "Конечно, ему нравилась " + getName() + ", но дружба с девочкой - это ведь совсем другое.";
        return info;
    }

    public void setSex(String sex1) {
        sex = sex1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return kappaPride == character.kappaPride &&
                Objects.equals(name, character.name) &&
                Objects.equals(friends, character.friends) &&
                Objects.equals(sex, character.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, friends, kappaPride, sex);
    }

    public String getSex() {
        return sex;
    }

    public boolean checkFriend(Character character) {
        return (this.friends.contains(character));
    }

    public abstract void seasonAction(Season season);

    public abstract void randomAction();
}
