package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solved_55 {
    public int[] solution(String my_string) {

        List<String> list = new ArrayList<>(Arrays.asList(my_string.split("")));

        list.removeIf(s -> !s.matches("[0-9]"));
        Collections.sort(list);

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i ++) {
            answer[i] = Integer.parseInt(list.get(i));
        }

        return answer;
    }
}