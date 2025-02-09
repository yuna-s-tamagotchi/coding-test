package level0;

public class Solved_22 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= 1000; j++) {
                if (i * j == n) {
//                    System.out.println("i: " + i + ", j: " + j);
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
