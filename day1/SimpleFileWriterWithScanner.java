package day1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleFileWriterWithScanner {
    public static void main(String[] args) {
        try {
            File data = new File("D:\\Files\\Programming\\Projects\\100daysOfJava\\day1\\data.txt");
            Scanner fileReader = new Scanner(data);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Files\\Programming\\Projects\\100daysOfJava\\day1\\result.txt", true));
            while (fileReader.hasNext()) {
                bufferedWriter.write(fileReader.next());
                if (fileReader.hasNext())
                    bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
