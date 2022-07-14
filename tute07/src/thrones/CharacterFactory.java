package thrones;

import java.util.Random;

public class CharacterFactory {
    private static Random random = new Random();

    public static Character generateCharacter(String type) {
        if (type.equals("King")) {
            return new King(random.nextInt(), random.nextInt(), 1);
        } else if (type.equals("Queen")) {
            return new Queen(random.nextInt(), random.nextInt());
        } else {
            return new Dragon(random.nextInt(), random.nextInt());
        }
    }

    public static King generateKing() {
        return new King(random.nextInt(), random.nextInt(), 1);
    }

    public static Queen generateQueen() {
        return new Queen(random.nextInt(), random.nextInt());
    }
}