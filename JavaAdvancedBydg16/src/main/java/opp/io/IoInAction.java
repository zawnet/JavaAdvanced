package opp.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class IoInAction {

    public static void main(String[] args) throws IOException {
        File file = new File("files/data.txt");

        System.out.println(file.getName());
        System.out.println(file.exists());

        if(!file.exists()){
            File parent = file.getParentFile();
            parent.mkdirs();
            file.createNewFile();
        }
        System.out.println(file.exists());

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException ex){
                ex.printStackTrace();
        }

        try (BufferedReader reader = Files.newBufferedReader(Paths.get("files/data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null){

                System.out.println(line);
                String[] parts = line.split(";");
                System.out.println(Arrays.toString(parts));
            }
        }
        catch (IOException ex){

        }

    }


}
