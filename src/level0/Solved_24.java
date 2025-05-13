package level0;

// numbers[i] 값을 answer 배열에 어케넣어요??? 거참
// 32번 마냥 어케든 넣음;;;촴나 이거 아닌거같은데

import java.util.Arrays;

public class Solved_24 {
    public int[] solution(int[] numbers, int num1, int num2) {

//        numbers[i] 값의 갯수를 구한다.
//        갯수 만큼 for문을 돌린다.
//        answer 배열에 값을 넣는다.
//        어케함? 아나 ㅋㅋ
        //기면정 바보
//
        int[] answer = {};
//        int count = 0;
//
//
//        for (int i = num1; i <= num2; i ++) {
//            numbers[count++] = numbers[i];
//        }
//
//        answer = new int[count];
//
//        for (int i = 0; i < answer.length; i++){
//            answer[i] = numbers[i];
//        }


        answer = Arrays.copyOfRange((numbers), num1, num2+1);

        return answer;
    }
}
