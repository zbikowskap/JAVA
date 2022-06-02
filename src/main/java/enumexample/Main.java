package enumexample;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();

        game.startGame(LevelEnum.LEVEL_3);

        //Metoda values zwraca tablice wszystkich dostepnych wartosci Enuma.
        for (LevelEnum value : LevelEnum.values()) {
            System.out.println(value);
        }

        //Enumy mozna porownac za pomoca ==, co jest wyjatkowe w przypadku obiektow.
        System.out.println(LevelEnum.LEVEL_1 == LevelEnum.LEVEL_1);

    }

}
