package opp.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class ReadingBytesInAction {

    public static void main(String[] args) {
        readInts();
        readGzipInts();
    }

    private static void readGzipInts() {
        String fileName = "files/ints.bin.gz";

        File file = new File(fileName);
        List<Integer> ints = new ArrayList<>();
        try (InputStream inputStream = new FileInputStream(file);
             GZIPInputStream gzipInputStream = new GZIPInputStream(inputStream);
             DataInputStream dataInputStream = new DataInputStream(gzipInputStream)){
            try {
                while (true) {
                    ints.add(dataInputStream.readInt());
                    // System.out.println(dataInputStream.readInt());
                }
            }
            catch (EOFException ex){
                //odczytałem wszystko, doszedłem do konca pliku
            }
        }
        catch (IOException ex){

        }
    }

    private static void readInts() {
        String fileName = "files/ints.bin";

        File file = new File(fileName);
        List<Integer> ints = new ArrayList<>();
        try (InputStream inputStream = new FileInputStream(file);
             DataInputStream dataInputStream = new DataInputStream(inputStream)){
            try {
                while (true) {
                    ints.add(dataInputStream.readInt());
                   // System.out.println(dataInputStream.readInt());
                }
            }
            catch (EOFException ex){
                //odczytałem wszystko, doszedłem do konca pliku
            }
        }
        catch (IOException ex){

        }
    }
}
