package level0;

public class Solved_32 {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        // 240211
        // 이렇게 int[] answer = {}; 써있으면 배열 선언과 동시에 초기화가 아닌가??
        // 이 answer 이란 배열에 값을 어케 넣는걸77ㅏ??
        // answer = new int[] 하면 배열 길이는 어케 넣지?? if에 충족되는 숫자(n)만 넣고픈데 ㅠㅠ
        int count = 0;


        for (int num : numlist) {
            if ( num % n == 0 ){
                numlist[count++] = num;
            }
        }

        answer = new int[count];


        for (int i = 0; i < count; i ++){
            answer[i] = numlist[i];
        }


        return answer;
    }
}
