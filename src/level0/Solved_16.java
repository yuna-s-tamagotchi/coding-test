package level0;
import java.util.Arrays;

public class Solved_16 {
    public int solution(int[] numbers16) {
        int answer = 0;
        int max = numbers16[0]; // 테스트 5에서 실패 이유. 이렇게 하면 음수 처리를 못함 -> Integer.MIN_VALUE 변경 필요
        int max2 = numbers16[0];    // Integer.MIN_VALUE 변경 필요

        for (int number : numbers16) {
            if (number > max ) {
                max2 = max;
                max = number;
            } else if (number > max2) {
                max2 = number;
            }
        }
        Arrays.sort(numbers16);
        int n = numbers16.length;

        answer = numbers16[n - 1] * numbers16[n - 2];

        return answer;
    }
}
