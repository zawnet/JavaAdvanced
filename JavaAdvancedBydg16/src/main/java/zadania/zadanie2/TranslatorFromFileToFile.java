package zadania.zadanie2;

import opp.books.Book;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class TranslatorFromFileToFile {
    private  Map<String, String>  dictionary;
    private List<String> translatedWords;

    public TranslatorFromFileToFile() {
        this.dictionary = new TreeMap<>();

    }

    private void loadDictionary(String filePath)  {

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))){
            String line;
            while ((line = reader.readLine()) != null){
                String[] parts = line.split(":");
                System.out.println(Arrays.toString(parts));
                dictionary.put(parts[1],parts[0]);

            }
        }
        catch (FileNotFoundException ex){
            System.out.println("Nie odnaleziono pliku ze słownikiem");
        }
        catch (IOException ex){
            System.out.println("Nie znaleziono pliku ze słownikiem");
        }
    }

    private void translateFile(String filePath){
        this.translatedWords = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            Boolean newLine = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.toLowerCase(Locale.ROOT).split("\\s+");
                if(newLine){
                    translatedWords.add("\n");
                }
                newLine = false;
                for (String str : parts){
                    if(!str.equals("\\s")) {
                        translatedWords.add(dictionary.getOrDefault(str,str));
                    }
                }
                newLine = true;
                //translatedWords.add("\n");
               // System.out.println(Arrays.toString(parts));
            }
        }
        catch (FileNotFoundException ex){
            System.out.println("Plik nie został odnaleziony");
        }
        catch (IOException ex){
            System.out.println("Błąd poczas wczytywania pliku");
        }
    }

    private void saveTranslatedFile(String filePath){

        File outFile = new File(filePath);
        boolean exists = outFile.exists();

        if(!exists){
            outFile = new File(filePath);
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outFile))) {

            String txt = String.join(" ",translatedWords).trim();

            bufferedWriter.write(txt);

        }
        catch (IOException ex){
            System.out.println("Błąd poczas zapisu do pliku");
        }

    }

    public static void main(String[] args) throws IOException {

        TranslatorFromFileToFile translatorFromFileToFile = new TranslatorFromFileToFile();
        translatorFromFileToFile.loadDictionary("files/zadania/zadanie2/dictionary_en_pl.txt");
        translatorFromFileToFile.translateFile("files/zadania/zadanie2/wordsToTranslate.txt");
        translatorFromFileToFile.saveTranslatedFile("files/zadania/zadanie2/wordsTranslated.txt");

    }


}
