package level0;

import java.util.*;

public class Solved_69 {
    public String solution(String s) {
        String answer = "";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }


        List<Character> list = new ArrayList<>();

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if(e.getValue() == 1) {
                list.add(e.getKey());
            }
        }

        Collections.sort(list);

        for (Character c : list) {
            answer += c;
        }


        return answer;
    }
}
