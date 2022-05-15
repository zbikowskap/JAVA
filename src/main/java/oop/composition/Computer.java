package oop.composition;

public class Computer {

    private Processor processor;
    private GraphicCard graphicCard;
    private PowerSupply powerSupply;

    public Computer(Processor processor, GraphicCard graphicCard, PowerSupply powerSupply) {
        this.processor = processor;
        this.graphicCard = graphicCard;
        this.powerSupply = powerSupply;
    }

    public String description() {
        return "Komputer z procesorem " + processor.getName()
                + " karta graficzna " + graphicCard.getName()
                + " i zasilaczem " + powerSupply.getName();
    }

}
