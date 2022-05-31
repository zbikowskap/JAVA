package functionalprogramming.exercise;

public class Main {

    public static void main(String[] args) {

        StringProcessor processor = new StringProcessor(word -> word.toUpperCase());

        String result = processor.process("ala");

        System.out.println(result);

    }

}
