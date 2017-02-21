/**
 * Created by mpjoh on 2/21/2017.
 */
public class GameCharacter {
    private String name;
    private int strength;
    private int intelligence;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public GameCharacter(String name, int strength, int intelligence) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;

    }

    public void play() {
        System.out.println("name of character: " + name);
        System.out.println("strngth " + strength);
        System.out.println("intelligence " + intelligence);
    }
}
