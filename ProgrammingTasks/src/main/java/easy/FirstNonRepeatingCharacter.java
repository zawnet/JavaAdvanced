package easy;

import java.util.*;

/**
 * Given a string, find the first non-repeating character in it.
 * For example, if the input string is “GeeksforGeeks”, then the output should be ‘f’
 * and if the input string is “GeeksQuiz”, then the output should be ‘G’.
 * @author Paweł Zawada
 */
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String inputString = "GeeksQuiz";
        findFirstNonRepeatingCharacterByTreeMap(inputString);
        findFirstNonRepeatingCharacterByHashMap(inputString);
        //findFirstNonRepeatingCharacterByHashMap("GeeksQuiz");
    }

    /**
     * Sorted Map version
     * @param inputString
     */
    public static void findFirstNonRepeatingCharacterByTreeMap(String inputString){
        char[] inputCharsArray = inputString.toCharArray();
        TreeMap<Character, Integer> charastersMap = new TreeMap<>();

        for(int i = 0; i<inputCharsArray.length; i++){
            char key = inputString.charAt(i);
            if(charastersMap.containsKey(key)){
                charastersMap.put(key,charastersMap.get(key).intValue()+1);
            }
            else {
                charastersMap.put(key,1);
            }
        }

        for (Map.Entry<Character, Integer> pair : charastersMap.entrySet()) {
            if(pair.getValue() == 1){
                System.out.println(pair.getKey());
                break;
            }
            else{
                continue;
            }
        }
    }

    /**
     * Unsorted Map version
     * @param inputString
     */
    public static void findFirstNonRepeatingCharacterByHashMap(String inputString){
        char[] inputCharsArray = inputString.toCharArray();
        HashMap<Character, Integer> charastersMap = new HashMap<>();

        for(int i = 0; i<inputCharsArray.length; i++){
            char key = inputString.charAt(i);
            if(charastersMap.containsKey(key)){
                charastersMap.put(key,charastersMap.get(key).intValue()+1);
            }
            else {
                charastersMap.put(key,1);
            }
        }

        for(int i = 0; i<inputCharsArray.length; i++){
            if(charastersMap.get(inputCharsArray[i])==1){
                System.out.println(inputCharsArray[i]);
                break;
            }
        }
    }

}
