package level0;

// 49. 최댓값 만들기 (2)

public class Solved_49 {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE; // 테스트 코드 7번 오류: 0으로 초기화하면 안됨. 최대값이 음수가 될 경우 고려

        for (int i = 0; i < numbers.length; i ++) {
            for (int k = numbers.length - 1; k >= 0; k--){
                if (numbers[i] * numbers[k] > answer && i != k) {
                    answer = numbers[i] * numbers[k];
                }
            }
        }

        return answer;
    }
}
