package level0;

import java.util.Objects;

public class Solved_21 {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] stringArr = my_string.split("");
        for (String s : stringArr) {
            if (!Objects.equals(s, letter)) {
                answer += s;
            }
        }
        return answer;
    }
}
