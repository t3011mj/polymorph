/**
 * Created by mpjoh on 2/21/2017.
 */
public class Warrior extends GameCharacter {
    private String weaponType;

    public Warrior(String name, int strength, int intelligence, String weaponType) {
        super(name, strength, intelligence);
        this.weaponType = weaponType;
    }

    public Warrior(String name, int strength, int intelligence) {
        super(name, strength, intelligence);

    }
    @Override
    public void play () {
        super.play();
        System.out.println(weaponType + " is the weapon type ");
    }
}
