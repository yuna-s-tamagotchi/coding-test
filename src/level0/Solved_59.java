package level0;

public class Solved_59 {
    public int solution(int n) {
        int answer = 0;
        int pizza = 6;

        for (int i = 1; i < n; i++){
            if ((pizza * i) % n == 0){
                answer = i;
                break;
            }
        }

        return answer;
    }
}
