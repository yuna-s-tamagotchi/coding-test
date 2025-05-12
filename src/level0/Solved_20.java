package level0;

import java.util.*;

public class Solved_20 {
    public String solution(String my_string) {
        List<String> list = new ArrayList<>(Arrays.asList(my_string.split("")));

        list.removeIf(s -> "aeiou".contains(s));

        return String.join("", list);
    }
}
