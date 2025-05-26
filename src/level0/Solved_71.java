package level0;

public class Solved_71 {
    public int solution(int n) {
        int answer = 1;

        for(int i = 1; i <= 10; i++) {

            answer *= i;

            if (answer == n) return i;
            if (answer > n) return i-1;
        }
        return answer;
    }
}
