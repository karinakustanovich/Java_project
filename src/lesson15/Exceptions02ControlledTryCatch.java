package lesson15;

import java.io.File;
import java.io.FileReader;
import java.util.Date;

public class Exceptions02ControlledTryCatch {
    public static void main(String[] args) {
        File ourFile = new File("D://file.txt");
        Date date = new Date();

        try {
            FileReader reader = new FileReader(ourFile);
        } catch (Exception exception) {
            System.out.println("Log1: File not Found " + date.getTime());
            System.out.println(exception.getMessage());
        }
    }
}
