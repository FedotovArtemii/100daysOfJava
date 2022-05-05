package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleFileReaderWithScanner {
    public static void main(String[] args) {
        try {
            File data = new File("D:\\Files\\Programming\\Projects\\100daysOfJava\\day1\\data.txt");
            Scanner fileReader = new Scanner(data);
            while (fileReader.hasNext()) {
                System.out.println(fileReader.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }
    }
}
