package level0;

public class Solved_48 {
    public int solution(String my_string) {
        int answer = 0;
        String numbers = "123456789";

        char[] stringArr = my_string.toCharArray();
        char[] numberArr = numbers.toCharArray();


        for (char c : stringArr) {
            for (char c1 : numberArr) {
                if (c == c1) {
                    answer += c - '0';
                }
            }
        }

        return answer;
    }
}
