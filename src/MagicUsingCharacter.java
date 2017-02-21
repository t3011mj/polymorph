/**
 * Created by mpjoh on 2/21/2017.
 */
public class MagicUsingCharacter extends GameCharacter {

    private int magicalEnergy;

    public MagicUsingCharacter(String name, int strength, int intelligence, int magicalEnergy) {
        super(name, strength, intelligence);
        this.magicalEnergy = magicalEnergy;
    }

    public MagicUsingCharacter(String name, int strength, int intelligence) {
        super(name, strength, intelligence);
    }

    public int getMagicalEnergy() {
        return magicalEnergy;
    }

    public void setMagicalEnergy(int magicalEnergy) {
        this.magicalEnergy = magicalEnergy;
    }
    @Override
    public void play () {
        super.play();
        System.out.println(magicalEnergy + " is the magical energy ");
    }
}
