package day1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SimpleFileWriterWithBuffered {
    static ArrayList<String> readFile(File file) {
        ArrayList<String> result = new ArrayList<>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (true) {
                line = br.readLine();
                if (line == null)
                    break;
                String[] words = line.split(" ");
                Collections.addAll(result, words);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
            return null;
        }
        return result;
    }

    static void writeToFile(File file, Collection<String> text) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            for (String element : text) {
                fileWriter.write(element);
                fileWriter.write("\n");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    public static void main(String[] args) {
        File file = new File("/home/artemiy/IdeaProjects/100daysOfJava/day1/data.txt");
        ArrayList<String> result = readFile(file);
        if (result==null) {
            System.out.println("There was an error");
        } else {
            writeToFile(new File("/home/artemiy/IdeaProjects/100daysOfJava/day1/result.txt"), result);
            //System.out.println(result);
        }
    }
}
