package level0;

public class Solved_41 {
    public int solution(int[] box, int n) {
        int answer = 1;

        for (int i : box) {
            answer *= i / n;
        }
//      배열 길이가 고정된 경우에는 반복문 보다 box[0], box[1] 처럼 직접 접근하는 게 빠름
//     public int[] solution(int n) {
//         int idx = 0;
//         int size = (n + 1) / 2;
//         int[] answer = new int[size];

//         for (int i = 1; i <= n; i ++) {
//             if(i % 2 != 0) {
//                 answer[idx++] = i;
//             }
//         }

        return answer;
    }
}
