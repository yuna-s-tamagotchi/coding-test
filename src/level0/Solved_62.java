package level0;

public class Solved_62 {
    public int solution(int order) {
        int result = 0;
        char[] charOrder = String.valueOf(order).toCharArray();

        for (char c : charOrder) {
            if(c == '3' || c == '6' || c == '9'){
                result++;
            }
        }

        return result;
    }
}
