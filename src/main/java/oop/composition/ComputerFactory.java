package oop.composition;

public class ComputerFactory {

    public static Computer create(String processorName, String graphicCardName,
                                  String powerSupplyName) {
        Processor processor = new Processor(processorName);
        GraphicCard graphicCard = new GraphicCard(graphicCardName);
        PowerSupply powerSupply = new PowerSupply(powerSupplyName);

        return new Computer(processor, graphicCard, powerSupply);
    }

}
