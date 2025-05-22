package level0;

import java.util.Arrays;

public class Solved_66 {
    public int solution(String before, String after) {
        int answer = 0;

        char[] beforeChar = before.toCharArray();
        char[] afterChar = after.toCharArray();
        Arrays.sort(beforeChar);
        Arrays.sort(afterChar);

        before = new String(beforeChar);
        after = new String(afterChar);

        if (before.equals(after)) answer = 1;

        return answer;
    }
}
