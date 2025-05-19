package level0;

public class Solved_60 {
    public String solution(int age) {
        String[] program962 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String strAge = Integer.toString(age);
        char[] charAge = strAge.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < charAge.length; i++){
            result.append(program962[charAge[i] - '0']);
        }

        return result.toString();
    }
}
