package level0;

public class Solved_47 {
    public String solution(String rsp) {
        String answer = "";
        char rock = '0';
        char scissors = '2';
        char paper = '5';
        StringBuilder sb = new StringBuilder();

        char[] rspArr = rsp.toCharArray();

        for (char arr : rspArr) {
            if(rock == arr){
                sb.append("5");
            }
            else if(scissors == arr){
                sb.append("0");
            }
            else if(paper == arr){
                sb.append("2");
            }
        }

        answer = String.valueOf(sb);

        return answer;
    }
}
