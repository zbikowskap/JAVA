package functionalprogramming.exercise;

public class Main {

    public static void main(String[] args) {

        StringProcessor processor = new StringProcessor(word -> word.toUpperCase());

        System.out.println(processor.process("ala"));
        System.out.println(processor.process("aaaa"));
        System.out.println(processor.process("bbbb"));
        System.out.println(processor.process("accccla"));

    }

}
