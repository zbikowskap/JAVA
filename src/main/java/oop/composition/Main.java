package oop.composition;

public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor("i7");
        GraphicCard graphicCard = new GraphicCard("RTX 2070");
        PowerSupply powerSupply = new PowerSupply("Corsair 650W");

        Computer computer = new Computer(processor, graphicCard, powerSupply);
        System.out.println(computer.description());
    }

}
