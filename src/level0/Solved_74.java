package level0;

import java.util.ArrayList;
import java.util.Arrays;

public class Solved_74 {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(my_str.split("")));
        ArrayList<String> answerList = new ArrayList<>();

        for (int i = 0; i < my_str.length(); i++) {
            System.out.println(strList.get(i));

            if(i % n == 0){
            }
        }

        return answer;
    }
}
