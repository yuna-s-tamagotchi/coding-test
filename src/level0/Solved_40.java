package level0;

import java.util.Arrays;

public class Solved_40 {
    public int solution(int[] array) {
        int answer = 0;
        int half = array.length / 2;

        Arrays.sort(array);
        answer = array[half];

        return answer;
    }
}
