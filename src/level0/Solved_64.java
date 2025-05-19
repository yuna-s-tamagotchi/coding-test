package level0;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class Solved_64 {
    public String solution(String my_string) {
        String answer = "";

        //  유연성 떨어짐. 타입은 인터페이스로 해주는 게 좋음 Set<String>
        LinkedHashSet<String> mySet = new LinkedHashSet<>();
        String[] myArr = my_string.split("");

        for (String s : myArr) {
            mySet.add(s);
        }

        answer = mySet.stream().collect(Collectors.joining());

        return answer;
    }
}
