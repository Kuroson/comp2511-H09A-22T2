package thrones;

public class Game {
    public static void main(String[] args) {

        King king = CharacterFactory.generateKing();
        Queen queen = CharacterFactory.generateQueen();
        Character king2 = CharacterFactory.generateCharacter("King");
        // Knight knight = new Knight(0, 2);
        // Dragon dragon = new Dragon(-1, 0);

        // knight.attack(dragon);
    }

}