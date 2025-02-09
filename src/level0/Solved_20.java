package level0;

import java.util.Objects;

public class Solved_20 {
    public String solution(String my_string) {
        String answer = "";
        String[] stringArr = {"a", "e", "i", "o", "u"};
        String[] myStringArr = my_string.split("");

        for(int i = 0; i < myStringArr.length; i++){
            for(int j = 0; j < stringArr.length; j++){
                if(!myStringArr[i].equals(stringArr[j])){
                    answer += myStringArr[i];
                }
            }
        }
        return answer;
    }
}
