package level0;

public class Solved_11 {
    public int solution(int slice, int n) {
        int answer = 0;
        if(slice >= 2 && slice <= 10 && n >= 1 && n <= 100) {
            for (int i = 1; i <= n; i++) {
                if ( slice * i >= n) {
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }
}
