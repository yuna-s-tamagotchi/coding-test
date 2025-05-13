package level0;

public class Solved_56 {
    public String solution(String cipher, int code) {
        String answer = "";

        // +=는 계속 새로운 문자열 객체를 생성함
        // StringBuilder가 더 효율적
        for(int i = 1; i <= cipher.length(); i++){
            if(i % code == 0) answer += cipher.charAt(i-1);
        }

        return answer;
    }
}
