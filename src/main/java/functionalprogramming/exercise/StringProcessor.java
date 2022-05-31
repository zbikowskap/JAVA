package functionalprogramming.exercise;

public class StringProcessor {

    private StringOperation stringOperation;

    public StringProcessor(StringOperation stringOperation) {
        this.stringOperation = stringOperation;
    }

    public String process(String input) {
        return stringOperation.operation(input);
    }

}
