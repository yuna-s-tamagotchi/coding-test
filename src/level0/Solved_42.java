package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solved_42 {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int count = 0;


        for (int num : numlist) {
            if ( num % n == 0 ){
                numlist[count++] = num;
            }
        }

        answer = new int[count];


        for (int i = 0; i < count; i ++){
            answer[i] = numlist[i];
        }

        return answer;
    }
}
