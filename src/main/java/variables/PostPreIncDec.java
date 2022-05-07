package variables;

public class PostPreIncDec {

    public static void main(String[] args) {

        int number = 10;

        //Post inkrementacja, zwiekszamy number o 1 ale do metody println trafia wartosc 10.
        System.out.println(number++); //10

        //Pre inkrementacja, w number jest juz 11, zwiekszamy o 1 i do metody println trafia wartosc 12.
        System.out.println(++number); //12

        //Post dekrementacja, w number aktualnie jest wartosc 12, zmniejszamy ja o 1 ale do println trafia dalej 12.
        System.out.println(number--); //12

        //Pre dekrementacja, w number aktualnie jest wartosc 11, zmniejszamy ja natychmiastowo o 1 i wyswietlamy.
        System.out.println(--number); //10

    }

}
