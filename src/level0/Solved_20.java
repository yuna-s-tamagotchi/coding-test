package level0;

public class Solved_20 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String[] stringArr = {"a", "e", "i", "o", "u"};
        String[] myStringArr = my_string.split("");

        for (String s : myStringArr) {
            for (String string : stringArr) {
                if (!s.equals(string)) {
                    answer.append(s);
                }
            }
        }
        return answer.toString();
    }
}
