package functionalprogramming.exercise;

public class Main {

    public static void main(String[] args) {

        Processor processor = new Processor(word -> word.toUpperCase());

        System.out.println(processor.process("ala"));
        System.out.println(processor.process("aaaa"));

        processor.setOperation(word -> word.toLowerCase());

        System.out.println(processor.process("ALA"));
        System.out.println(processor.process("AAAA"));

        processor.setOperation(word -> word.substring(0,3));

        System.out.println(processor.process("pigwa"));
        System.out.println(processor.process("motocykl"));



    }

}
