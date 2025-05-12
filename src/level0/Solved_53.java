package level0;

import java.util.ArrayList;

public class Solved_53 {
    public ArrayList<Integer> solution(int[] array) {
        int temp = array[0];
        int idx = 0;
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i=1; i<array.length; i++){
            if (temp < array[i]) {
                temp = array[i];
                idx = i;
            }
        }

        answer.add(temp);
        answer.add(idx);

        return answer;
    }
}
