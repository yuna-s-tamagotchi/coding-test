package level0;

public class Solved_33 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (String s : s1) {
            for (String string : s2) {
                if ( s.equals(string)) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
