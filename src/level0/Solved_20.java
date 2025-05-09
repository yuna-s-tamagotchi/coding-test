package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solved_20 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder(my_string);
        String[] stringArr = {"a", "e", "i", "o", "u"};
        String[] myStringArr = my_string.split("");
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();


        for (int i = 0; i < myStringArr.length; i++) {
            for (String string : stringArr) {
                if (myStringArr[i].equals(string)) {
                    list.add(i);
                }
            }
        }

        for (Integer i : list) {
            for (String s : myStringArr) {
                    System.out.println("s: " + s + ", idx: " + my_string.charAt(i));
            }
        }



        return answer.toString();
    }
}
