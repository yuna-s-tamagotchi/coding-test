package level0;

public class Solved_37 {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int count = 0;
        for (int number : numbers) {
            numbers[count++] = number * 2;
        }
        return numbers;

        // 리턴을 numbers 말고 answer로 하고픈데 어케하는지 몰겠슴니다
        // answer에 number * 2를 넣는 방법이 몬가요??
        // 32번에서 모르겠는 점과 같아
    }
}
