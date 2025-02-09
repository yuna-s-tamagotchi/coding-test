package level0;

public class Solved_25 {
    public int solution(int n) {
        int answer = 0;
        int pizza = 7;

        for (int i = 1; i <= n; i++){
            if (pizza * i >= n){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
