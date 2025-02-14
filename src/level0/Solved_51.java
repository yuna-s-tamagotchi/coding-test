package level0;

import java.util.Arrays;

public class Solved_51 {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        char[] stringArr = my_string.toCharArray();
        char[] tmp = new char[1];


        tmp[0] = stringArr[num1];
        stringArr[num1] = stringArr[num2];
        stringArr[num2] = stringArr[num1];
        stringArr[num2] = tmp[0];


        answer = new String(stringArr);

        return answer;
    }
}
