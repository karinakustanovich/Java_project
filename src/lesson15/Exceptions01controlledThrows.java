package lesson15;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions01controlledThrows {
    public static void main(String[] args) throws IOException {
        File ourFile = new File("D://file.txt");
        FileReader reader = new FileReader(ourFile);
        reader.close();
    }
}
