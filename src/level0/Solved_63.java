package level0;

import java.util.HashMap;
import java.util.Map;

public class Solved_63 {
    public String solution(String letter) {
        String answer = "";
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put(".-", "a");
        hashMap.put("-...", "b");
        hashMap.put("-.-.", "c");
        hashMap.put("-..", "d");
        hashMap.put(".", "e");
        hashMap.put("..-.", "f");
        hashMap.put("--.", "g");
        hashMap.put("....", "h");
        hashMap.put("..","i");
        hashMap.put(".---","j");
        hashMap.put("-.-","k");
        hashMap.put(".-..","l");
        hashMap.put("--","m");
        hashMap.put("-.","n");
        hashMap.put("---","o");
        hashMap.put(".--.","p");
        hashMap.put("--.-","q");
        hashMap.put(".-.","r");
        hashMap.put("...","s");
        hashMap.put("-","t");
        hashMap.put("..-","u");
        hashMap.put("...-","v");
        hashMap.put(".--","w");
        hashMap.put("-..-","x");
        hashMap.put("-.--","y");
        hashMap.put("--..","z");

        String[] morseArr = letter.split(" ");

        for (String morse : morseArr) {
            if(hashMap.containsKey(morse)){
                answer += hashMap.get(morse);
            }
        }

        return answer;
    }
}
