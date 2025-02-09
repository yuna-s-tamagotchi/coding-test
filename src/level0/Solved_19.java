package level0;

import java.util.Arrays;

public class Solved_19 {
    public int solution(int n) {
        int answer = 0;
        String string = Integer.toString(n);
        String[] stringArr = string.split("");
        int[] arr = new int[stringArr.length];

        for(int i = 0; i < stringArr.length; i++) {
            answer += Integer.parseInt(stringArr[i]);
        }

        return answer;
    }
}
