package level0;

public class Solved_50 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        char[] stringArr = my_string.toCharArray();

        for (char c : stringArr) {
            if (Character.isUpperCase(c)){
                answer.append(Character.toLowerCase(c));
            }
            else {
                answer.append(Character.toUpperCase(c));
            }
        }

        return answer.toString();
    }
}
