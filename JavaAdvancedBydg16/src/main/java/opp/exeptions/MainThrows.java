package opp.exeptions;

import java.io.BufferedReader;
import java.io.IOException;

public class MainThrows {
    public static void main(String[] args) {

    }

    void processFile(BufferedReader reader) throws IOException {
        String inputLine = null;
        while ((inputLine = reader.readLine()) != null){
            System.out.println(inputLine);
        }

    }
}
