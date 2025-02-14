package level0;

public class Solved_41 {
    public int[] solution(int n) {
        int idx = 0;
        int size = (n + 1) / 2;
        int[] answer = new int[size];

        for (int i = 1; i <= n; i ++) {
            if(i % 2 != 0) {
                answer[idx++] = i;
            }
        }

        return answer;
    }
}
