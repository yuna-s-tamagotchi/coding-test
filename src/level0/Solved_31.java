package level0;

public class Solved_31 {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int sum = 0;

        for (int side : sides) {
            if (max < side) {
                max = side;
            }
            sum += side;
        }

        if (max < sum - max) {
            answer = 1;
        }
        else {
            answer = 2;
        }

        return answer;
    }
}
