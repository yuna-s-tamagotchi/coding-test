package level0;

public class Solved_35 {
    public int solution(int num1, int num2) {
        int answer = 0;
        double divide = (double) num1 / num2;
        double result = divide * 1000;

        answer = (int) result;

        return answer;
    }
}
