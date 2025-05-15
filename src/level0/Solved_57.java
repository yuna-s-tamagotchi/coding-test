package level0;

import java.util.Arrays;

public class Solved_57 {
    public String solution(String my_string) {
        String answer = "";

        answer = my_string.toLowerCase();
        char[] arr = answer.toCharArray();

        Arrays.sort(arr);

        return answer = new String(arr);
    }
}
