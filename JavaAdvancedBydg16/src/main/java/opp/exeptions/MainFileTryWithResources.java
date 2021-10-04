package opp.exeptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainFileTryWithResources {
    public static void main(String[] args) {


        try (BufferedReader reader = new BufferedReader(new FileReader("file_name"))) {

            String inputLine = null;
            while ( (inputLine = reader.readLine()) != null){
                System.out.println(inputLine);
            }
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
