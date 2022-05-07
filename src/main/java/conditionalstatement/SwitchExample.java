package conditionalstatement;

public class SwitchExample {

    public static void main(String[] args) {

        int option = 6;

        switch (option) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Opcja z przedzialu 1 - 4");
                break;
            case 5:
                System.out.println("Opcja numer 5");
                break;
            default:
                System.out.println("Wybrano błędną opcję");
        }



    }

}
