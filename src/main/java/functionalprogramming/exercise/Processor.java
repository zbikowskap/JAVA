package functionalprogramming.exercise;

public class Processor {

    private Operation operation;

    public Processor(Operation operation) {
        this.operation = operation;
    }

    public String process(String input) {
        return operation.operation(input);
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
