package lesson10;

import java.util.ArrayList;
import java.util.Arrays;

public class MyComputers {
    public static void main(String[] args) {

        ArrayList<Computer> computers = new ArrayList<>();

        Chip chip = new Chip("Intel", 242423423L, 13);
        GraphicCard graphicCard = new GraphicCard(345345435L, "Nvidia");
        Memory[] memories = {
                new Memory(24, "Kingston"),
                new Memory(24, "Kingston"),
                new Memory(24, "Kingston"),
                new Memory(24, "Kingston"),
        };
        SolidDrive solidDrive = new SolidDrive("Sandisk", 1000);

        Computer computer = new Computer(234234423, chip, graphicCard, memories, solidDrive);

        computers.add(computer);

        for (int i = 0; i < 3; i++) {

            computers.add(new Computer
                    (350.6, new Chip("Intel", 242423423L, 13),
                            new GraphicCard(345345435L, "Nvidia"),
                            new Memory[]{
                                    new Memory(24, "Kingston"),
                                    new Memory(24, "Kingston"),
                                    new Memory(24, "Kingston"),
                                    new Memory(24, "Kingston"),
                            },
                            new SolidDrive("Sandisk", 1000)

                    )
            );

        }

        computers.forEach(System.out::println);

        System.out.println("computers.get(2).getMemory() = " + Arrays.toString(computers.get(2).getMemory()));

        for(int i = 0; i < computers.get(2).getMemory().length; i++) {
            System.out.println(computers.get(2).getMemory()[i]);
        }
    }
}

