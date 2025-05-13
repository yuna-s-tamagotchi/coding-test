package level0;

public class Solved_54 {
    public int solution(int[] box, int n) {
        int answer = 1;

        // 배열 길이가 고정적일 경우 for 반복문 보다 box[0], box[1] 이렇게 적어주는게 더 효율적
        for (int i : box) {
            answer *= i / n;
        }

        return answer;
    }
}
