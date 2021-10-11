package opp.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IoWriterInAction {

    public static void main(String[] args) {

        String fileName = "files/data2.txt";

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get(fileName))) {

        }
        catch (IOException ex){

        }

    }
}
