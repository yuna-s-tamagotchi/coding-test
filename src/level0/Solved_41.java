package level0;

public class Solved_41 {
    public int solution(int[] box, int n) {
        int answer = 1;

        for (int i : box) {
            answer *= i / n;
        }
//      배열 길이가 고정된 경우에는 반복문 보다 box[0], box[1] 처럼 직접 접근하는 게 빠름

        return answer;
    }
}
