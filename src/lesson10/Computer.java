package lesson10;

import java.util.Arrays;

public class Computer {

    private double price;
    private Chip chip;
    private GraphicCard graphicCard;
    private Memory[] memory;
    private SolidDrive solidDrive;

    public Computer(double price, Chip chip, GraphicCard graphicCard, Memory[] memory, SolidDrive solidDrive) {
        this.price = price;
        this.chip = chip;
        this.graphicCard = graphicCard;
        this.memory = memory;
        this.solidDrive = solidDrive;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Chip getChip() {
        return chip;
    }

    public void setChip(Chip chip) {
        this.chip = chip;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public Memory[] getMemory() {
        return memory;
    }

    public void setMemory(Memory[] memory) {
        this.memory = memory;
    }

    public SolidDrive getSolidDrive() {
        return solidDrive;
    }

    public void setSolidDrive(SolidDrive solidDrive) {
        this.solidDrive = solidDrive;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", chip=" + chip +
                ", graphicCard=" + graphicCard +
                ", memory=" + Arrays.toString(memory) +
                ", solidDrive=" + solidDrive +
                '}';
    }
}
