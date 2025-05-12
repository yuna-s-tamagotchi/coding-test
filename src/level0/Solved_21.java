package level0;

import java.util.Objects;

public class Solved_21 {
    public String solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();
        String[] stringArr = my_string.split("");
        for (String s : stringArr) {
            if (!Objects.equals(s, letter)) {
                answer.append(s);
            }
        }
        return answer.toString();
    }
}
