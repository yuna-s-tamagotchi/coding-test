package level0;

import java.util.Arrays;

public class Solved_68 {
    public int[] solution(int[] emergency) {
        int[] answer = {};
        answer = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(answer);

        for (int i = 0; i < answer.length; i++) {
            for (int k = 0; k < answer.length; k++) {
                if (emergency[k] == answer[i]) {
                    System.out.println("answer["+i+"]: " + answer[i] + ",   emergency["+k+"]: " + emergency[k]);
//                    emergency[k] = answer.length - i;
                }
            }
        }

        System.out.println(Arrays.toString(emergency));

        return answer;
    }
}
