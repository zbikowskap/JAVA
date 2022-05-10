package loops;

public class ForEachExample {

    public static void main(String[] args) {
        //Deklaracja tablicy z wartosciami
        String[] array = {"Michal" , "Marcin", "Beata"};

        //for each
        //zmienna typu tablicy : tablica
        for (String element : array) {
            System.out.println(element);
        }

    }

}
