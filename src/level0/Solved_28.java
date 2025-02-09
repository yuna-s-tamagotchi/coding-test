package level0;

public class Solved_28 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String[] stringArr = my_string.split("");

        for(int i = stringArr.length - 1; i >= 0; i--){
            answer.append(stringArr[i]);
        }
        return answer.toString();
    }
}
