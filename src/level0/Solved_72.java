package level0;

public class Solved_72 {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int i : array) {
            sb.append(i);
        }

        for(int i = sb.length()-1; i >= 0; i--) {
            if(sb.charAt(i) == '7') {
                answer++;
            }
        }

        return answer;
    }
}
