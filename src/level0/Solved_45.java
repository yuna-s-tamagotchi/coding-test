package level0;

public class Solved_45 {
    public int solution(int n) {
        int answer = 0;

        if(n % 2 == 0){
            for(int i=0; i<=n; i+=2){
                answer += (int) Math.pow(i, 2);
            }
        }
        else {
            for(int i=0; i<=n; i++){
                if(i % 2 != 0){
                    answer += i;
                }
            }
        }

        return answer;
    }
}
