package day1;

import java.io.*;
import java.util.ArrayList;

public class SimpleFileReaderWithBufferedReader {
    public static void main(String[] args) {
        File data = new File("D:\\Files\\Programming\\Projects\\100daysOfJava\\day1\\data.txt");
        String [] words;
        try {
            BufferedReader br = new BufferedReader(new FileReader(data));
            while (true) {
                String line = br.readLine();
                if(line==null)
                    break;
                words = line.split(" ");
                for (String word : words) {
                    System.out.println(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
