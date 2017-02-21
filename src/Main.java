import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<GameCharacter> gcGameCharacter = new ArrayList<GameCharacter>();
        gcGameCharacter.add(new Warrior("Warrior 1",100, 200));
        gcGameCharacter.add(new Warrior("Warrior 2", 300, 50 ));
        gcGameCharacter.add(new Wizard("Wizard 1", 100, 500, 400, 200 ));
        gcGameCharacter.add(new Wizard("Wizard 2", 400, 200, 1000, 100 ));
        gcGameCharacter.add(new Wizard("Wizard 3", 500, 50, 4000, 100 ));

        for (GameCharacter gc: gcGameCharacter) {
            gc.play();
        }

    }
}
