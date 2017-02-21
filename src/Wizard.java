/**
 * Created by mpjoh on 2/21/2017.
 */
public class Wizard extends MagicUsingCharacter {

    private int spellNumber;

    public Wizard(String name, int strength, int intelligence, int magicalEnergy, int spellNumber) {
        super(name, strength, intelligence, magicalEnergy);
        this.spellNumber = spellNumber;
    }

    public Wizard(String name, int strength, int intelligence, int magicalEnergy) {
        super(name, strength, intelligence, magicalEnergy);
    }

    /* public Wizard(String name, int strength, int intelligence) {
        super(name, strength, intelligence);
    } */

    public int getSpellNumber() {
        return spellNumber;
    }

    public void setSpellNumber(int spellNumber) {
        this.spellNumber = spellNumber;
    }

    @Override
    public void play () {
        super.play();
        System.out.println(spellNumber + " is the spell number ");
    }
}
