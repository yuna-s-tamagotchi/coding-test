package level0;

// numbers[i] 값을 answer 배열에 어케넣어요??? 거참
// 32번 마냥 어케든 넣음;;;촴나 이거 아닌거같은데

public class Solved_24 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        int count = 0;


        for (int i = num1; i <= num2; i ++) {
            numbers[count++] = numbers[i];
        }

        answer = new int[count];

        for (int i = 0; i < answer.length; i++){
            answer[i] = numbers[i];
        }

        return answer;
    }
}
