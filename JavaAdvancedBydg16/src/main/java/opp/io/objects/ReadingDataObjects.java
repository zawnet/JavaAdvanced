package opp.io.objects;

import java.io.*;

public class ReadingDataObjects {

    public static void main(String[] args) {
        String fileName = "files/person.bat";
        File file = new File(fileName);

        try (InputStream inputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {



        } catch (IOException ex) {

        }
    }
}
