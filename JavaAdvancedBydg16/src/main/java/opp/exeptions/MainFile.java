package opp.exeptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainFile {

    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("file_name"));
            String inputLine = null;
            while ( (inputLine = reader.readLine()) != null){
                System.out.println(inputLine);
            }
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                System.out.println("Closing file");
                reader.close();
            } catch (IOException e) {
                System.out.println("Error closing file ");
            }
        }
    }
}
