package level0;

public class Solved_19 {
    public int solution(int n) {
        int answer = 0;
        String string = Integer.toString(n);
        String[] stringArr = string.split("");
        int[] arr = new int[stringArr.length];

        for (String s : stringArr) {
            answer += Integer.parseInt(s);
        }

        return answer;
    }
}
