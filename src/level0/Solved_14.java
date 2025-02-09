package level0;

public class Solved_14 {
    public int solution(int n) {
        int answer = 2;

        for(int i = 2; i < 1000000; i++){
            if (i * i == n) {
                answer = 1;
            }
        }
        return answer;
    }
}
