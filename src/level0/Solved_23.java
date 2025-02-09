package level0;

public class Solved_23 {
    public String solution(String my_string, int n) {
        String answer = "";

        for(int i = 0; i < my_string.length(); i++) {
            for (int j = 1; j <= n; j++) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}
