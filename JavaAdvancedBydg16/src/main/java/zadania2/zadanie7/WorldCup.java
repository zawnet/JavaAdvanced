package zadania2.zadanie7;

import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WorldCup {

    private  Map<Integer, String> winnersMap;

    public WorldCup() {
        winnersMap = new HashMap<>();
    }

    private void generateWinnersMap(){
        winnersMap.put(1930,"Urugwaj");
        winnersMap.put(1934,"Włochy");
        winnersMap.put(1938,"Włochy");
    }

    private void addToWinnersMap(String element){
        String elements[] = element.split(":");
        winnersMap.put(Integer.parseInt(elements[0]), elements[1]);
    }

    private void generateFromInput(File inputFile){

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            winnersMap = reader.lines()
                    .map(s -> s.split(":"))
                    .collect(Collectors.toMap(a->Integer.parseInt(a[0]), a -> a[1]));
//            while ((line = reader.readLine()) != null){
//                addToWinnersMap(line);
//            }
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found");
        }
        catch (IOException ex){

        }
    }

    private void showAllWinners(){
        getWinnersWithSum().forEach((s, aLong) -> System.out.println(s+": "+aLong));
    }

    public Map<String, Long> getWinnersWithSum(){
        return winnersMap.values().stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }

    private String showWinnerInfo(int yearCup) throws IllegalArgumentException, NoSuchElementException{

        if(!Integer.class.isInstance(yearCup)){
            throw new IllegalArgumentException("Unexpected year argument");
        }
        String value;
        if((value=winnersMap.get(yearCup)) == null){
            throw new NoSuchElementException("No Cup found in year: "+yearCup);
        }
        else {
            return value;
        }
    }

    public static void main(String[] args) {
        WorldCup worldCoup = new WorldCup();
        //worldCoup.generateWinnersMap();

        File worldCupFile = new File("files/zadania2/worldcup.txt");
        worldCoup.generateFromInput(worldCupFile);
        System.out.println(worldCoup.getWinnersWithSum());
        worldCoup.showAllWinners();
        System.out.println("Please input year of Cup:");
        try {
            Scanner input = new Scanner(System.in);
            System.out.println(worldCoup.showWinnerInfo(input.nextInt()));
        }
        catch (InputMismatchException ex){
            System.out.println("Wrong input format");
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        catch (NoSuchElementException ex){
            System.out.println(ex.getMessage());
        }
    }
}
